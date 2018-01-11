package com.henghao.domain.entity;

import lombok.Data;

import java.util.Date;

@Data
/**
 * @author wzp
 * @description: mybatis逆向生成：
 * 用户经纬度+出勤率实体类
 * @create on 2017/12/3.
 */
public class UserPositionLog {
    private String id;
    // 地址
    private String address;
    // 上传时间
    private Date ctime;
    // 纬度
    private Double latitude;
    // 经度
    private Double longitude;
    // 用户名
    private String name;
    // 用户ID
    private String uid;

    /**
     * 空构造
     */
    public UserPositionLog() {

    }

    /**
     * 全构造
     */
    public UserPositionLog(String id, String address, Date ctime, Double latitude, Double longitude, String name, String uid) {
        this.id = id;
        this.address = address;
        this.ctime = ctime;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.uid = uid;
    }

    /**
     *  除ID外的构造
     */
    public UserPositionLog(String address, Date ctime, Double latitude, Double longitude, String name, String uid) {
        this.address = address;
        this.ctime = ctime;
        this.latitude = latitude;
        this.longitude = longitude;
        this.name = name;
        this.uid = uid;
    }
}