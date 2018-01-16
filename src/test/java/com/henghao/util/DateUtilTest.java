package com.henghao.util;

import org.junit.Test;

public class DateUtilTest {
    @Test
    public void daysBetween() throws Exception {

        String start = "2018-1-16";
        String end = "2019-1-15";
        Integer between = DateUtil.daysBetween(start, end);
        System.out.println(between);
    }

    @Test
    public void getMonthLastDay() throws Exception {
        int monthLastDay = DateUtil.getDaysForMonth(2018,2);
        System.out.println(monthLastDay);
    }

}