package com.henghao.domain.entity;

import lombok.Data;

@Data
/**
 * @author wzp
 * @description: mybatis逆向生成：
 * 车辆经纬度实体类，当时只是做测试用
 * @create on 2017/12/3.
 */
public class CarItude {
    // ID
    private Integer carTestId;
    // 车辆纬度
    private String carLatitude;
    // 车辆经度
    private String carLongitude;
    // 车牌号
    private String carNum;
    // 经纬度上传时间
    private String carUptime;

}