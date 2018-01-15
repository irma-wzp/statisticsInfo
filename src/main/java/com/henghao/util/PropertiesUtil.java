package com.henghao.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * @author wzp
 * @description 配置文件相关帮助类
 * @create on 2018/1/15.
 */
public class PropertiesUtil {

    public static String getPropertiesValueByKey(String key) {

        Properties prop = new Properties();
        try {
            //装载配置文件
            String separator = File.separator;
            String path = "src"+separator+"main"+separator+"resources"+separator+"static"+separator+"dbconfig.properties";
//            String path = "static"+separator+"dbconfig.properties";
            prop.load(new FileInputStream(new File(path)));

        } catch (IOException e) {
            e.printStackTrace();
//            throws new CustomerException("系统找不到指定的路径");
        }
        //返回获取的值
        return prop.getProperty(key);
    }


}
