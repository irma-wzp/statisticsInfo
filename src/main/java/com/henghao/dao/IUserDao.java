package com.henghao.dao;

import com.henghao.common.domain.entity.UserDO;
import com.henghao.common.domain.entity.UserHistoryItudeDO;
import com.henghao.common.domain.entity.UserItudeDO;
import com.henghao.common.domain.example.UserExample;
import com.henghao.common.dto.UserPasswordDTO;
import com.henghao.common.vo.LoginVo;
import com.henghao.common.vo.UserUpdateVo;
import com.henghao.common.vo.UserVo;
import com.henghao.common.vo.UsrLongAndLatVo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

@SuppressWarnings("all")
public interface IUserDao {

    /*
     * 逆向生成工具自带 Start
     */
    int countByExample(UserExample example);

    int deleteByExample(UserExample example);

    int deleteByPrimaryKey(String id);

    int insert(UserDO record);

    int insertSelective(UserDO record);

    List<UserDO> selectByExample(UserExample example);

    UserDO selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UserDO record, @Param("example") UserExample example);

    int updateByExample(@Param("record") UserDO record, @Param("example") UserExample example);

    int updateByPrimaryKeySelective(UserDO record);

    int updateByPrimaryKey(UserDO record);

    /*
     * 逆向生成工具自带 End
     */



    /*
     * 自定义 Start
     */

    /**
     * 用户修改密码
     * @param upDTO {@link UserPasswordDTO}
     */
    void updatePassword(UserPasswordDTO upDTO) throws Exception;

    /**
     * 保存用户历史经纬度
     * @param historyItude {@link UserHistoryItudeDO}
     * @throws Exception
     */
    void saveUserHistoryItude(UserHistoryItudeDO historyItude) throws Exception;

    /**
     * 保存用户实时经纬度
     * @param itudeDO {@link UserItudeDO}
     * @throws Exception
     */
    void saveUserItudeDO(UserItudeDO itudeDO) throws Exception;

    /**
     * 更新用户实时经纬度
     * @param itudeDO {@link UserItudeDO}
     * @throws Exception
     */
    void updateUserItudeByPrimaryKey(UserItudeDO itudeDO) throws Exception;

    /**
     * 根据用户ID，获取用户实时经纬度
     * @param uid
     * @return
     */
    UserItudeDO getItudeByUid(String uid) throws Exception;

    /**
     * 查询用户历史经纬度集合
     *
     * @author wzp
     * @create on 2017
     * @update on 2017/12/4
     * @return {@link List<UsrLongAndLatVo>}
     */
    List<UsrLongAndLatVo> selectUserTitudesDao()throws Exception;

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
    UserDO findUserToCheck(LoginVo loginVo);

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


    /*
     * 自定义 End
     */

}