package com.henghao.domain.entity;

import lombok.Data;

@Data
/**
 * @author wzp
 * @description: mybatis逆向生成：
 * 用户公告实体类
 * @create on 2017/12/3.
 */
public class Notice {
    private Integer id;
    // 公告ID
    private String gid;
    // 用户ID
    private String uid;
    // 用户已读（0：否，1：是）
    private String userIsread;
    // 用户已删（0：否，1：是）
    private String userIsdelete;

    /**
     * 空构造
     */
    public Notice() {

    }

    // 除ID外的构造
    public Notice(String gid, String uid, String userIsread, String userIsdelete) {
        this.gid = gid;
        this.uid = uid;
        this.userIsread = userIsread;
        this.userIsdelete = userIsdelete;
    }
}