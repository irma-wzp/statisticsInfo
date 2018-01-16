package com.henghao.common.dto;

import lombok.Data;

/**
 * APP端用户修改密码的包装类
 * @author wzp
 * @description DTO（Data Transfer Object） ：数据传输对象， Service 或 Manager 向外传输的对象。
 * @create on 2018/1/12.
 */
@Data
public class UserPasswordDTO {

    // 用户ID
    private String uid;
    // 原密码
    private String originalPassword;
    // 新密码
    private String newPassword;
    // 确认密码
    private String confirmPassword;
}
