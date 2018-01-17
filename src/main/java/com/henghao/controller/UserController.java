package com.henghao.controller;

import com.henghao.common.domain.entity.UserDO;
import com.henghao.common.domain.entity.UserItudeDO;
import com.henghao.common.dto.UserPasswordDTO;
import com.henghao.common.result.Result;
import com.henghao.common.result.Status;
import com.henghao.common.vo.LoginVo;
import com.henghao.common.vo.UserUpdateVo;
import com.henghao.service.IUserService;
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
     * @param upDTO 用户密码包装类
     * @return Result
     * @update on 2018/1/15 已解决
     */
    @ResponseBody
    @RequestMapping(value = {"/APPpassword"}, produces = {"application/json;charset=utf-8"})
    public Status APPpassword(UserPasswordDTO upDTO)  throws Exception {
        return userService.updatePassword(upDTO);

    }

    /**
     * 用户上传经纬度，出勤率
     * @param itudeDO {@link UserItudeDO}
     * @update update on 2018/1/16 已解决
     * @return {@link Result}
     */
    @ResponseBody
    @RequestMapping(value = {"/LongAndLat"}, produces = {"application/json;charset=utf-8"})
    public Status LongAndLat(UserItudeDO itudeDO) throws Exception {
        return userService.addUserItude(itudeDO);
    }

    /**
     * PC端获取历史经纬度
     * @create on 2017/..
     * @update update on 2017/12/4 已解决
     * @return {@link Result}
     */
    @ResponseBody
    @RequestMapping(value = {"/getItude"}, produces = {"application/json;charset=utf-8"})
    public Result getLongitudeAndLatitude() throws Exception {
        return userService.getTitudeToPC();
    }

    /**
     * 查询用户代办事项数量
     * http://localhost:8080/statisticsInfo/user/myMessages?uid=HZ9080955acfcfff015acfe9cb0f044d
     * @param uid 用户ID
     * @return {@link Result}
     * @update update on 2017/12/4 已解决
     */
    @ResponseBody
    @RequestMapping(value = {"/myMessages"}, produces = {"application/json;charset=utf-8"})
    public Result myMessages(String uid) throws Exception {
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
     * @param userDO 用户实体类
     * @param updateVo 修改用户包装类
     * @return Result
     */
    @ResponseBody
    @RequestMapping(value = {"/updatePersonal"}, produces = {"application/json;charset=utf-8"})
    public Result updatePersonal(UserDO userDO, UserUpdateVo updateVo) {
        return userService.updatePersonal(userDO, updateVo);

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
