package com.henghao.controller;

import com.henghao.domain.entity.CarItude;
import com.henghao.domain.entity.result.Result;
import com.henghao.service.ICarItudeTestService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;

@Controller
@RequestMapping({"/carTest"})
/**
 * @author wzp
 * @description: 车辆经纬度控制层，当时只是作为测试
 * @update on 2017/12/3.
 */
public class CarItudeTestControl {
    @Resource
    private ICarItudeTestService carTest;

    @RequestMapping(value = {"/carItude"}, produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Result carItude(CarItude carItude) {
        return this.carTest.addItude(carItude);
    }

    @RequestMapping(value = {"/findAllItude"}, produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Result findAllItude() {
        return this.carTest.findAllItude();
    }

    @RequestMapping(value = {"/findLatestItude"}, produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Result findLatestItude() {
        return this.carTest.findLatest();
    }
}
