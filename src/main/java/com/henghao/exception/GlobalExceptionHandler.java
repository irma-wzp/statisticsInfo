package com.henghao.exception;

import com.google.gson.Gson;
import com.henghao.domain.entity.result.Result;
import com.henghao.domain.entity.result.StatusEnum;
import com.henghao.util.DateUtil;
import com.henghao.util.RequestUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;
import org.springframework.web.servlet.HandlerExceptionResolver;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @description 全局异常处理
 * @auth 王章鹏
 * @create on 2017/12/10.
 */

public class GlobalExceptionHandler implements HandlerExceptionResolver {

    private static final Logger LOGGER = LogManager.getLogger(GlobalExceptionHandler.class.getName());


    public ModelAndView resolveException(HttpServletRequest httpServletRequest,
                                         HttpServletResponse httpServletResponse, Object o, Exception ex) {

        /** 将异常写入日志 - Start **/
        // 判断日志输出级别
        if (LOGGER.isInfoEnabled()) {
            LOGGER.info("异常通知： " + "\t" + ex.getMessage());
        }
        //详细错误信息
        StringBuilder errorMsg = new StringBuilder();
        StackTraceElement[] trace = ex.getStackTrace();
        for (StackTraceElement s : trace) {
            errorMsg.append("\t at ").append(s).append("\r\n");
        }
        // 写入异常日志
        writeLog(errorMsg.toString(), ex);
        /**** 将异常写入日志 - End ****/

        // 解析出异常类型
        // 如果该 异常类型是系统 自定义的异常，直接取出异常信息，在错误页面展示
        // 如果该 异常类型不是系统 自定义的异常，构造一个自定义的异常类型（信息为“未知错误”）
        CustomerException customerException;
        if (ex instanceof CustomerException) {
            customerException = (CustomerException) ex;
        } else {
            customerException = new CustomerException("未知错误！");
        }
        String message = customerException.getMessage();

        // 如果是ajax请求，JSON格式返回
        if (RequestUtil.ajaxRequest(httpServletRequest)){
            PrintWriter writer = null;
            try {
                httpServletResponse.setContentType("application/json;charset=UTF-8");
                writer = httpServletResponse.getWriter();
                String json = new Gson().toJson(new Result(1,StatusEnum.UNKNOWN_ERROR.getEXPLAIN(),""));
                System.out.println("json={}"+json);
                writer.write(json);
                writer.flush();
                writer.close();
            } catch (IOException e) {
                if (writer != null){
                    writer.flush();
                    writer.close();
                }
                //详细错误信息
                StringBuilder ioMSG = new StringBuilder();
                StackTraceElement[] ioTrace = e.getStackTrace();
                for (StackTraceElement element : ioTrace) {
                    ioMSG.append("\t at ").append(element).append("\r\n");
                }
                // 写入异常日志
                writeLog(ioMSG.toString(), e);
            }
            return null;
        }else{
            // 如果不是ajax，跳转到 error.html
            ModelAndView modelAndView = new ModelAndView();
            modelAndView.addObject("message", message);
            modelAndView.setViewName("redirect:/500.html");
            return modelAndView;
        }

    }


    /**
     * 写入日志方法
     * @param detailErrMsg 详细错误信息
     * @Description 日志异常
     * @author wzp
     * @create on 2017/12/18
     */
    private void writeLog(String detailErrMsg, Exception ex) {

        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder.
                getRequestAttributes()).getRequest();
        //获取请求的URL
        StringBuffer requestURL = request.getRequestURL();
        //获取参 数信息
        String queryString = request.getQueryString();
        //封装完整请求URL带参数
        if (queryString != null) {
            requestURL.append("?").append(queryString);
        }
        try {
            // 创建输出异常log日志
            String separator = File.separator;
            // 每天生成一个日志
            String filePath = "F:" + separator + "usrlog" + separator +
                    DateUtil.getCurrentStringDate("yyyy-MM-dd") + separator
                    + "exception.log";

            File file = new File(filePath);
            //if file doesn't exists, then create it
            if (!file.getParentFile().exists())
                file.getParentFile().mkdirs();   // 创建文件夹
            if (!file.exists()) {
                file.createNewFile();           // 创建文件
            }
            FileWriter fw = new FileWriter(filePath, true);
            BufferedWriter bw = new BufferedWriter(fw);

            //日志具体参数
            StringBuffer sb = new StringBuffer();
            SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
            sb.append("-----------" + sdf.format(new Date()) + "------------\r\n");
            sb.append("远程请求URL: [" + requestURL + "]\r\n");
            sb.append("详细错误信息：" + ex + "\r\n");
            sb.append(detailErrMsg + "\r\n");
            //注意需要转换对应的字符集
            bw.append(new String(sb.toString().getBytes("utf-8")) + "\r\n");
            bw.close();
            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}

