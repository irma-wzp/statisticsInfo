package com.henghao.domain.entity;

import lombok.Data;

@Data
/**
 * @author wzp
 * @description: mybatis逆向生成：
 * 用户头像实体类，因为用户表是工作流当中的，所以不方便添加字段
 * @create on 2017/12/3.
 */
public class UserImage {
    private Integer id;
    // 用户ID
    private String userid;
    // 用户头像文件名
    private String userimage;

    /**
     * 空构造
     */
    public UserImage() {}

    /**
     * 除ID外的构造
     * @param userid 用户ID
     * @param userimage 用户头像文件名
     */
    public UserImage(String userid, String userimage) {
        this.userid = userid;
        this.userimage = userimage;
    }
}