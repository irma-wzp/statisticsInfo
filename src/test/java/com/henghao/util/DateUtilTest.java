package com.henghao.util;

import org.junit.Test;

public class DateUtilTest {
    @Test
    public void getMonthLastDay() throws Exception {
        int monthLastDay = DateUtil.getDaysForMonth(2018,2);
        System.out.println(monthLastDay);
    }

}