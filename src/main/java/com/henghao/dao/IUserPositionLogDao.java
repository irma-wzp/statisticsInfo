package com.henghao.dao;

import com.henghao.common.domain.entity.UserPositionLog;
import com.henghao.common.domain.example.UserPositionLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUserPositionLogDao {
    int countByExample(UserPositionLogExample example);

    int deleteByExample(UserPositionLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserPositionLog record);

    int insertSelective(UserPositionLog record);

    List<UserPositionLog> selectByExample(UserPositionLogExample example);

    UserPositionLog selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserPositionLog record, @Param("example") UserPositionLogExample example);

    int updateByExample(@Param("record") UserPositionLog record, @Param("example") UserPositionLogExample example);

    int updateByPrimaryKeySelective(UserPositionLog record);

    int updateByPrimaryKey(UserPositionLog record);
}