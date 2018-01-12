package com.henghao.dao;

import com.henghao.common.domain.entity.UserLongitude;
import com.henghao.common.domain.example.UserLongitudeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUserLongitudeDao {
    int countByExample(UserLongitudeExample example);

    int deleteByExample(UserLongitudeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserLongitude record);

    int insertSelective(UserLongitude record);

    List<UserLongitude> selectByExample(UserLongitudeExample example);

    UserLongitude selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserLongitude record, @Param("example") UserLongitudeExample example);

    int updateByExample(@Param("record") UserLongitude record, @Param("example") UserLongitudeExample example);

    int updateByPrimaryKeySelective(UserLongitude record);

    int updateByPrimaryKey(UserLongitude record);
}