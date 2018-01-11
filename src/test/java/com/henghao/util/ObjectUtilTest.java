package com.henghao.util;

import com.henghao.vo.user.UserUpdateVo;
import junit.framework.TestCase;

public class ObjectUtilTest extends TestCase {
    public void testUpdateNew() throws Exception {
    }

    public void testIsEmpty1() throws Exception {
    }

    public void testIsNotEmpty1() throws Exception {
    }

    public void testObjPropertyIsNull() throws Exception {
        UserUpdateVo up = new UserUpdateVo();
        up.setDeptId("");
        up.setId("");
        boolean empty = ObjectUtil.propertyIsNull(up);
        System.out.println(empty);
    }


    public void testIsEmpty() throws Exception {
        UserUpdateVo up = new UserUpdateVo();
        boolean empty = ObjectUtil.isEmpty(up);
        System.out.println(empty);
    }

    public void testIsNotEmpty() throws Exception {
    }



}