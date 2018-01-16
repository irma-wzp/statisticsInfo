package com.henghao.dao;

import com.henghao.common.domain.entity.UserItudeDO;
import com.henghao.common.domain.example.UserLongitudeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUserLongitudeDao {
    int countByExample(UserLongitudeExample example);

    int deleteByExample(UserLongitudeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserItudeDO record);

    int insertSelective(UserItudeDO record);

    List<UserItudeDO> selectByExample(UserLongitudeExample example);

    UserItudeDO selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserItudeDO record, @Param("example") UserLongitudeExample example);

    int updateByExample(@Param("record") UserItudeDO record, @Param("example") UserLongitudeExample example);

    int updateByPrimaryKeySelective(UserItudeDO record);

    int updateByPrimaryKey(UserItudeDO record);
}