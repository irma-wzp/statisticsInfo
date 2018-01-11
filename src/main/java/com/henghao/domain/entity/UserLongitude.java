package com.henghao.domain.entity;

import lombok.Data;

@Data
/**
 * @author wzp
 * @description: mybatis逆向生成：
 * 用户经纬度实体类
 * @create on 2017/12/3.
 */
public class UserLongitude {
    private Integer id;
    // 纬度
    private String latitude;
    // 经度
    private String longitude;
    // 用户ID
    private String uid;
    // 出勤率（rate of attendance）
    private String roa;

    /**
     * 空构造
     */
    public UserLongitude() {

    }

    /**
     * 除ID外的构造
     * @param latitude 纬度
     * @param longitude 经度
     * @param uid 用户ID
     * @param roa 出勤率（rate of attendance）
     */
    public UserLongitude(String latitude, String longitude, String uid, String roa) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.uid = uid;
        this.roa = roa;
    }
}