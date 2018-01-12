package com.henghao.controller;

import com.henghao.common.result.Result;
import com.henghao.service.IStatisticsService;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author wzp
 * @description: 统计信息控制层
 * @update on 2017/12/3.
 */
@Controller
@RequestMapping({"/statistics"})
public class StatisticsController {
    @Resource
    private IStatisticsService statisticsService;

    @RequestMapping(value = {"/tongji"}, produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Result tongji() {
        Result result = this.statisticsService.getAllInfo();
        return result;
    }

    @RequestMapping(value = {"/case"}, produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Result xzspAj() {
        return this.statisticsService.getCaseCount();
    }

    @RequestMapping(value = {"/importentDecision"}, produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Result impotentDecision(HttpServletRequest request) {
        System.out.println(request.getRemoteAddr());
        return this.statisticsService.getImportent();
    }
}
