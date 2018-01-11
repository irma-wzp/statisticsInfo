package com.henghao.service.impl;

import com.henghao.domain.entity.result.Status;
import com.henghao.domain.entity.result.StatusEnum;
import junit.framework.TestCase;

public class UserServiceImplTest extends TestCase {


    public void testUpdatePassword() throws Exception {
        // 非空验证
        Status status = new Status(StatusEnum.NO_PRAM.getCODE(), StatusEnum.NO_PRAM.getEXPLAIN());
        System.out.println(status);
    }

}