package com.henghao.domain.dao;

import com.henghao.domain.entity.CarItude;
import com.henghao.domain.example.CarItudeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ICarItudeDao {
    int countByExample(CarItudeExample example);

    int deleteByExample(CarItudeExample example);

    int deleteByPrimaryKey(Integer carTestId);

    int insert(CarItude record);

    int insertSelective(CarItude record);

    List<CarItude> selectByExample(CarItudeExample example);

    CarItude selectByPrimaryKey(Integer carTestId);

    int updateByExampleSelective(@Param("record") CarItude record, @Param("example") CarItudeExample example);

    int updateByExample(@Param("record") CarItude record, @Param("example") CarItudeExample example);

    int updateByPrimaryKeySelective(CarItude record);

    int updateByPrimaryKey(CarItude record);
}