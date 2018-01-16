package com.henghao.dao;

import com.henghao.common.domain.entity.UserHistoryItudeDO;
import com.henghao.common.domain.example.UserPositionLogExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUserPositionLogDao {
    int countByExample(UserPositionLogExample example);

    int deleteByExample(UserPositionLogExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserHistoryItudeDO record);

    int insertSelective(UserHistoryItudeDO record);

    List<UserHistoryItudeDO> selectByExample(UserPositionLogExample example);

    UserHistoryItudeDO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserHistoryItudeDO record, @Param("example") UserPositionLogExample example);

    int updateByExample(@Param("record") UserHistoryItudeDO record, @Param("example") UserPositionLogExample example);

    int updateByPrimaryKeySelective(UserHistoryItudeDO record);

    int updateByPrimaryKey(UserHistoryItudeDO record);
}