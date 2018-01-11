package com.henghao.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 * @author wzp
 * @description 日期工具类
 * @create on 2017/12/1.
 */
@SuppressWarnings("all")
public class DateUtil {

    /**
     * 判断字符串日期是否是指定时间格式
     * @create 2017-11-3
     * @param date 字符串日期
     * @param format 日期格式
     * @return boolean
     */
    public static boolean isDateOrNot(String date,String format){
        if ("".equals(date) || date == null ||
                "".equals(format) || format == null) {
            return false;
        }
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        try {
            sdf.parse(date);
        } catch (ParseException e) {
            return false;
        }
        return true;
    }

    /**
     * <b>根据时间格式获取当前时间</b><br>
     * y 年 M 月 d 日 H 24小时制 h 12小时制 m 分 s 秒
     *
     * @param format
     *            {@code String} 日期格式
     * @return {@code String} 字符串日期
     */
    public static String getCurrentStringDate(String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(new Date());
    }

    /**
     * 根据格式获取当前时间，如果日期格式错误，则返回 yyyy-MM-dd 格式的时间
     * @param format
     * @return java.util.Date 类型日期
     * @throws Exception
     */
    public static Date getCurrentDate(String format) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat(format);
            Date dateStr = sdf.parse(sdf.format(new Date()));
            return dateStr;
        } catch (ParseException e) {
            return getCurrentDate("yyyy-MM-dd");
        }

    }

    /**
     * 将 java.util.Date 类型转为指定格式字符串
     *
     * @param date
     *            java.util.Date 日期
     * @param format
     *            String 格式
     * @return String 字符串类型日期
     */
    public static String DateToString(Date date, String format) {
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(date);
    }


    /**
     * 获得指定日期的后几天（yy-MM-dd格式）
     *
     * @param specifiedDay
     *            指定的日期（yy-MM-dd格式）
     *  @param days 后几天
     * @return String yy-MM-dd格式
     */
    public static String getDayAfter(String specifiedDay, int days) {
        Calendar c = Calendar.getInstance();
        Date date;
        try {
            date = new SimpleDateFormat("yy-MM-dd").parse(specifiedDay);
        } catch (ParseException e) {
            // 传入specifiedDay有误
            return null;
        }
        c.setTime(date);
        int day = c.get(Calendar.DATE);
        // 重新设置日期
        c.set(Calendar.DATE, day + days);
        // 将日期转为字符串返回
        String dayAfter = new SimpleDateFormat("yyyy-MM-dd")
                .format(c.getTime());
        return dayAfter;
    }

    /**
     * 字符串的日期格式的计算
     */
    public static int daysBetween(String smdate, String bdate) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
        Calendar cal = Calendar.getInstance();
//        try {
            cal.setTime(sdf.parse(smdate));
            long time1 = cal.getTimeInMillis();
            cal.setTime(sdf.parse(bdate));
            long time2 = cal.getTimeInMillis();
            long between_days = (time2 - time1) / (1000 * 3600 * 24);
            return Integer.parseInt(String.valueOf(between_days));
//        } catch (ParseException e) {
//            e.printStackTrace();
//            return 0;
//        }
    }

}
