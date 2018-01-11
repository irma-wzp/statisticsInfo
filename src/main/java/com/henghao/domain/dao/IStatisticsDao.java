package com.henghao.domain.dao;

import com.henghao.vo.CarTargetVo;

import java.util.List;
import java.util.Map;

/**
 * @author wzp
 * @description: 统计查询mapper接口
 * @create on 2017/12/4.
 */
public interface IStatisticsDao {

    Object findPersonStatistics(String currentDate);

    int getCount(String s);

    Map<String,Object> findCarStatistics(String changeDay);

    Object findAEAA();

    List<String> getStrings(String sql_dept_list);

    Object getIMVo(String sql);

    List<CarTargetVo> getCarTargetVo();

    Map<String,Double> getCarLatest(String carno, String starttime, String endtime);
}
