package com.henghao.vo;

import lombok.Data;

/**
 * @author wzp
 * @description: APP用户登录包装类
 * @create on 2017/12/3.
 */
@Data
public class LoginVo {
    // 用户名
    private String username;
    // 密码
    private String password;
}
