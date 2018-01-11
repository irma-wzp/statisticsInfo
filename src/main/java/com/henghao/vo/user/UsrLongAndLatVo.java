package com.henghao.vo.user;

import lombok.Data;

@Data
/**
 * @author wzp
 * @description: 用户经纬度包装类
 * @create on 2017/12/3.
 */
public class UsrLongAndLatVo {

    private String uid;         // 用户ID
    private String uname;       // 用户名
    private String dept;        // 用户所属部门
    private String longitude;   // 经度
    private String latitude;    // 纬度
    private String ROA;         // 出勤率（rate of attendance）


    /**
     * 空构造
     */
    public UsrLongAndLatVo() {

    }

    public UsrLongAndLatVo(String uid, String longitude, String latitude) {
        this.uid = uid;
        this.longitude = longitude;
        this.latitude = latitude;
    }
}
