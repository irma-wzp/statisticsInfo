package com.henghao.util;

import org.junit.Test;

public class PropertiesUtilTest {

    @Test
    public void getProperties() throws Exception {

        String value = PropertiesUtil.getPropertiesValueByKey("db.logFileDir");
        System.out.println(value);
    }

}