package com.henghao.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.HashMap;
import java.util.Map;

/**
 * @description: 百度API帮助类,这个项目虽然之前是我开发的，
 * 但是后面同事修改过，源码被删除了，这是反编码过来的，
 * 所以我并不知道这个类是谁写的，反正不是我写的。。。
 * 我只是在后期还原的时候，尽量添加一些注解
 * @author: 龙宏？
 * @create: 不知道。。。
 */
public class BaiduMapUtil {

    // 返回的map
    static Map<String, Double> map = new HashMap();

    /**
     * 根据地址查询经纬度
     * @param address 地址
     * @return map集合（经度的key:lng，纬度的key:lat）
     */
    public static Map<String, Double> getLngAndLat(String address) {
        String ak = "Fun6r9EE1RPtZ8roRyy7tpM3dL0OQEEl";
        String url = "http://api.map.baidu.com/geocoder/v2/?address=" + address + "&output=json&ak=" + ak;
        String json = loadJSON(url);

        /*
        JSONObject obj = JSONObject.fromObject(json);
        if (obj.get("status").toString().equals("0")) {
            map.clear();
            double lng = obj.getJSONObject("result").getJSONObject("location").getDouble("lng");
            double lat = obj.getJSONObject("result").getJSONObject("location").getDouble("lat");
            map.put("lng", Double.valueOf(lng));
            map.put("lat", Double.valueOf(lat));
        }
        */
        return map;
    }

    /**
     * 访问URL返回json串
     * @param url 地址
     * @return json字符串
     */
    public static String loadJSON(String url) {
        StringBuilder json = new StringBuilder();
        try {
            URL oracle = new URL(url);
            URLConnection yc = oracle.openConnection();
            BufferedReader in = new BufferedReader(new InputStreamReader(
                    yc.getInputStream()));
            String inputLine;
            while ((inputLine = in.readLine()) != null) {
                json.append(inputLine);
            }
            in.close();
        } catch (MalformedURLException localMalformedURLException) {
        } catch (IOException localIOException) {
        }
        return json.toString();
    }
}
