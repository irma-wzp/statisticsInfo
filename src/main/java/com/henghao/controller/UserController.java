package com.henghao.controller;

import com.henghao.domain.entity.User;
import com.henghao.domain.entity.UserLongitude;
import com.henghao.domain.entity.result.Result;
import com.henghao.domain.entity.result.Status;
import com.henghao.service.IUserService;
import com.henghao.vo.LoginVo;
import com.henghao.vo.user.UserPassword;
import com.henghao.vo.user.UserUpdateVo;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;


/**
 * @author wzp
 * @description: APP端用户控制层
 * @update on 2017/12/3.
 */
@Controller
@RequestMapping({"/user"})
public class UserController {

    // service接口
    @Resource
    private IUserService userService;

    /**
     * APP端 - 用户修改密码
     * 0851000000197167
     * 165675
     * @param up 用户密码包装类
     * @return Result
     * @update: update on 2017/12/4
     */
    @ResponseBody
    @RequestMapping(value = {"/APPpassword"}, produces = {"application/json;charset=utf-8"})
    public Status APPpassword(UserPassword up) {
        return userService.updatePassword(up);
    }

    /**
     * 用户上传经纬度，出勤率
     *
     * @param uli        {@link UserLongitude}
     * @param attendance 出勤率
     * @return {@link Result}
     * @update: update on 2017/12/4
     */
    @ResponseBody
    @RequestMapping(value = {"/LongAndLat"}, produces = {"application/json;charset=utf-8"})
    public Result LongAndLat(UserLongitude uli, Double attendance) {
        return userService.longAndLat(uli, attendance);
    }

    /**
     * PC端获取历史经纬度
     *
     * @return {@link Result}
     * @update: update on 2017/12/4
     */
    @ResponseBody
    @RequestMapping(value = {"/getItude"}, produces = {"application/json;charset=utf-8"})
    public Result getLongitudeAndLatitude() {
        return userService.getTitudeToPC();
    }

    /**
     * 查询用户代办事项数量
     *
     * @param uid 用户ID
     * @return {@link Result}
     * @update: update on 2017/12/4
     */
    @ResponseBody
    @RequestMapping(value = {"/myMessages"}, produces = {"application/json;charset=utf-8"})
    public Result myMessages(String uid) {
        return userService.getMessages(uid);
    }

    /**
     * APP端 - 获取通讯录列表，所有用户集合
     *
     * @return {@link Result}
     */
    @ResponseBody
    @RequestMapping(value = {"/findAllUser"}, produces = {"application/json;charset=utf-8"})
    public Result findAllUser() {
        return userService.findAllUser();
    }

    /**
     * APP端 - 根据用户ID查询用户信息
     *
     * @param uid 用户ID
     * @return {@link Result}
     */
    @ResponseBody
    @RequestMapping(value = {"/findByUid"}, produces = {"application/json;charset=utf-8"})
    public Result findByUid(String uid) {
        return userService.findByUid(uid);
    }

    /**
     * 用户详细个人资料
     *
     * @param uid uid {@code String} 用户ID
     * @return {@link Result} 结果返回类
     */
    @ResponseBody
    @RequestMapping(value = {"/findPersonal"}, produces = {"application/json;charset=utf-8"})
    public Result findPersonal(String uid) {
        return userService.findPersonal(uid);
    }

    /**
     * APP端 - 修改用户信息
     * @param user 用户实体类
     * @param updateVo 修改用户包装类
     * @return Result
     */
    @ResponseBody
    @RequestMapping(value = {"/updatePersonal"}, produces = {"application/json;charset=utf-8"})
    public Result updatePersonal(User user, UserUpdateVo updateVo) {
        return userService.updatePersonal(user, updateVo);
    }

    /**
     * APP用户登录验证
     *
     * @param loginVo {@link LoginVo} 用户登录信息包装类
     * @return {@link Result} 结果返回类
     */
    @ResponseBody
    @RequestMapping(value = {"/loginCheck"}, produces = {"application/json;charset=utf-8"})
    public Result loginCheck(LoginVo loginVo) {
        return userService.loginCheck(loginVo);
    }

    /**
     * APP用户头像显示
     *
     * @param uid {@code String} 用户ID
     * @return {@link Result}
     * @create:  2017年4月8日11:19:30
     */
    @ResponseBody
    @RequestMapping(value = "/showUserImage", produces = "application/json;charset=utf-8")
    public Result showUserImage(String uid) {
        return userService.showUserImage(uid);
    }

    /**
     * APP新增用户头像上传功能	2017年4月8日10:19:56
     *
     * @param uid     {@code String} 用户ID
     * @param file    {@code MultipartFile} 用户头像文件
     * @return {@link Result}
     */
    @ResponseBody
    @RequestMapping(value = "/imageUpLoad", produces = "application/json;charset=utf-8")
    public Result imageUpLoad(String uid, @RequestParam(value = "headImage", required = false) MultipartFile file) {

        Result result;

        result = userService.addUserImage(uid,file);

        return result;

    }
}
