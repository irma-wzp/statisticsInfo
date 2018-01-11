package com.henghao.domain.entity.cartest;

import lombok.Data;

/**
 * @author wzp
 * @description:
 * @create on 2017/12/3.
 */
@Data
public class ItudeNum {

    private Integer num_itude_id;
    private Integer itude_id;
    private String car_num;
    private String car_longitude;
    private String car_latitude;
    private String car_upTime;
}
