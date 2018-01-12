package com.henghao.common.dto;

import lombok.Data;

/**
 * DTO（Data Transfer Object） ：数据传输对象， Service 或 Manager 向外传输的对象。
 * @author wzp
 * @description 数据传输对象 - APP端用户修改密码的包装类
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
