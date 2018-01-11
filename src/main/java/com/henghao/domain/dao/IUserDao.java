package com.henghao.domain.dao;

import com.henghao.domain.entity.result.Result;
import com.henghao.domain.entity.User;
import com.henghao.domain.example.UserExample;
import java.util.List;

import com.henghao.vo.LoginVo;
import com.henghao.vo.user.UserUpdateVo;
import com.henghao.vo.user.UserVo;
import com.henghao.vo.user.UsrLongAndLatVo;
import org.apache.ibatis.annotations.Param;

@SuppressWarnings("all")
public interface IUserDao {

    /*
     * 逆向生成工具自带 Start
     */
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String id);

    int insert(User record);

    int insertSelective(User record);

    List<User> selectByExample(UserExample example);

    User selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") User record, @Param("example") UserExample example);

    int updateByExample(@Param("record") User record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(User record);

    int updateByPrimaryKey(User record);

    /*
     * 逆向生成工具自带 End
     */



    /*
     * 自定义 Start
     */

    /**
     * 查询通讯录列表
     * @return
     * @throws Exception
     */
    List<UserVo> findAllUserToApp() throws Exception;

    /**
     * APP端根据用户ID查询用户信息
     * @param uid 用户ID
     * @return
     */
    UserVo findByUidToApp(String uid);

    /**
     * APP端的登录验证
     * @param loginVo
     * @return
     */
    User findUserToCheck(LoginVo loginVo);

    /**
     * 修改用户所属部门
     * @param updateVo {@link UserUpdateVo}
     */
    void updateUserDept(UserUpdateVo updateVo);

    /**
     * 保存用户头像到数据库
     * @param uid 用户ID
     * @param file_ture_name 文件名
     */
    void addImageInfo(String uid, String file_ture_name);

    /**
     * 查询用户历史经纬度集合
     *
     * @return {@link Result}
     * @update: update on 2017/12/4
     */
    List<UsrLongAndLatVo> selectUserTitudesDao();

    /*
     * 自定义 End
     */

}