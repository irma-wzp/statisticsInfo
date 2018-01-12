package com.henghao.service;

import com.henghao.common.domain.entity.UserDO;
import com.henghao.common.domain.entity.UserLongitude;
import com.henghao.common.dto.UserPasswordDTO;
import com.henghao.common.result.Result;
import com.henghao.common.result.Status;
import com.henghao.common.vo.LoginVo;
import com.henghao.common.vo.UserUpdateVo;
import org.springframework.web.multipart.MultipartFile;

public interface IUserService {

    /**
     * APP端 - 用户修改密码
     * @update: update on 2017/12/4
     * @param up 用户密码包装类
     * @return Status
     */
    Status updatePassword(UserPasswordDTO up);

    /**
     * PC端获取历史经纬度
     * @update: update on 2017/12/4
     * @return {@link Result}
     */
    Result getTitudeToPC();

    /**
     * 用户上传经纬度，出勤率
     * @update: update on 2017/12/4
     * @param uli {@link UserLongitude}
     * @param attendance 出勤率
     * @return {@link Result}
     */
    Result longAndLat(UserLongitude uli, Double attendance);

    /**
     * 查询用户代办事项数量
     * @update: update on 2017/12/4
     * @param uid 用户ID
     * @return {@link Result}
     */
    Result getMessages(String uid);

    /**
     * APP端 - 获取通讯录列表，所有用户集合
     * @return {@link Result}
     */
    Result findAllUser();

    /**
     * APP端 - 根据用户ID查询用户信息
     * @param uid 用户ID
     * @return {@link Result}
     */
    Result findByUid(String uid);

    /**
     * 查询用户个人详细资料
     * @param uid {@code String} 用户ID
     * @return {@link Result} 结果返回类
     */
    Result findPersonal(String uid);


    /**
     * APP端 - 修改用户信息
     * @param userDO 用户实体类
     * @param updateVo 修改用户包装类
     * @return Result
     */
    Result updatePersonal(UserDO userDO, UserUpdateVo updateVo);

    /**
     * 用户登录验证
     * @param loginVo {@link LoginVo} 用户登录信息包装类
     * @return {@link Result} 结果返回类
     */
    Result loginCheck(LoginVo loginVo);

    /**
     * APP新增用户头像上传功能
     * @param uid {@code String} 用户ID
     * @param file {@code String} 用户头像图片
     * @return {@link Result}
     */
    Result imageUpLoad(String uid, String file);

    /**
     * APP用户头像显示
     * @param uid {@code String} 用户ID
     * @return {@link Result}
     */
    Result showUserImage(String uid);

    boolean judgeUpload(String paramString1, String paramString2, String paramString3);

    /**
     * APP用户头像上传
     * @param uid 用户 ID
     * @param file 头像文件名
     * @return {@link Result}
     */
    Result addUserImage(String uid, MultipartFile file);
}
