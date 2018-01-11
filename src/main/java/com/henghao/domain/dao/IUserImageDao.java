package com.henghao.domain.dao;

import com.henghao.domain.entity.UserImage;
import com.henghao.domain.example.UserImageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface IUserImageDao {
    int countByExample(UserImageExample example);

    int deleteByExample(UserImageExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserImage record);

    int insertSelective(UserImage record);

    List<UserImage> selectByExample(UserImageExample example);

    UserImage selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserImage record, @Param("example") UserImageExample example);

    int updateByExample(@Param("record") UserImage record, @Param("example") UserImageExample example);

    int updateByPrimaryKeySelective(UserImage record);

    int updateByPrimaryKey(UserImage record);
}