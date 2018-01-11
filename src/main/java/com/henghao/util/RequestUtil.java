package com.henghao.util;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author wzp
 * @description 请求帮助类
 * @create on 2017/12/19.
 */
public class RequestUtil {

    /**
     * 判断是否ajax请求
     */
    public synchronized static boolean ajaxRequest(HttpServletRequest request){

//        try {
//            InputStream  is = request.getInputStream ();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
        String header = request.getHeader("X-Requested-With");
        System.out.println(header+"----------");
        if ("XMLHttpRequest".equals(request.getHeader("X-Requested-With"))) {
            return true;
        }
        return false;
    }

    /**
     * 解决跨域
     *
     */
    public static synchronized HttpServletResponse cross(HttpServletResponse response) {
        response.addHeader("Access-Control-Allow-Origin", "*");
        response.addHeader("Access-Control-Allow-Methods", "GET, POST");
        response.addHeader("Access-Control-Allow-Headers", "Content-Type");
        response.addHeader("Access-Control-Max-Age", "1800");   // 30 min
        return response;
    }

}
