package com.henghao.common.domain.entity;

import lombok.Data;

@Data
/**
 * @author wzp
 * @description: mybatis逆向生成：
 * 用户经纬度实体类
 * @create on 2017/12/3.
 */
public class UserItudeDO {
    private String id;
    // 纬度
    private Double latitude;
    // 经度
    private Double longitude;
    // 用户ID
    private String uid;
    // 出勤率
    private Double attendance;
    // （rate of attendance）计算为百分比，保留两位小数
    private String roa;


    /**
     * 空构造
     */
    public UserItudeDO() {

    }

    /**
     * 除ID外的构造
     * @param latitude 纬度
     * @param longitude 经度
     * @param uid 用户ID
     * @param attendance 出勤率
     */
    public UserItudeDO(Double latitude, Double longitude, String uid, Double attendance) {
        this.latitude = latitude;
        this.longitude = longitude;
        this.uid = uid;
        this.attendance = attendance;
    }
}