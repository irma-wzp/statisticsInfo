package com.henghao.service.impl;

import com.henghao.domain.dao.IUserDao;
import com.henghao.domain.entity.User;
import com.henghao.domain.entity.UserLongitude;
import com.henghao.domain.entity.result.Result;
import com.henghao.domain.entity.result.Status;
import com.henghao.domain.entity.result.StatusEnum;
import com.henghao.domain.example.UserExample;
import com.henghao.service.IUserService;
import com.henghao.util.DateUtils;
import com.henghao.vo.LoginVo;
import com.henghao.vo.user.UserPassword;
import com.henghao.vo.user.UserUpdateVo;
import com.henghao.vo.user.UserVo;
import com.henghao.vo.user.UsrLongAndLatVo;
import com.horizon.util.encrypt.DESEDE;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.io.File;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * @author wzp
 * @description: APP端用户service接口实现类
 * @update on 2017/12/3.
 */
@Service("userService")
public class UserServiceImpl implements IUserService {

    // mapper接口
    @Resource
    private IUserDao userDao;

    // service层map
    Map<String, Object> map_service_messages = new HashMap();

    /**
     * APP端 - 获取通讯录列表，所有用户集合
     * @return {@link Result}
     */
    public Result findAllUser() {
        Result result;
        try {
            List<UserVo> list = userDao.findAllUserToApp();
            result = new Result(0, "通讯录所有用户查询成功", list);
        } catch (Exception e) {
            e.printStackTrace();
            result = new Result(1, "通讯录查询失败", null);
        }
        return result;
    }

    /**
     * APP端 - 根据用户ID查询用户信息
     * @param uid 用户ID
     * @return {@link Result}
     */
    public Result findByUid(String uid) {
        Result result;
        if ((uid == null) || ("".equals(uid))) {
            result = new Result(1, "传入用户id为空", null);
            return result;
        }
        result = new Result(0, "查询成功", userDao.findByUidToApp(uid));
        return result;
    }

    public Result findPersonal(String uid) {
        Result result;
        if ((uid == null) || ("".equals(uid))) {
            result = new Result(1, "传入用户ID为空", null);
            return result;
        }
        try {
            result = new Result(0, "个人资料查询成功", userDao.selectByPrimaryKey(uid));
        } catch (Exception e) {
            result = new Result(0, "系统繁忙", null);
        }
        return result;
    }

    /**
     * APP端 - 修改用户信息
     * @param user 用户实体类
     * @param updateVo 修改用户包装类
     * @return Result
     */
    public Result updatePersonal(User user, UserUpdateVo updateVo) {
        // 返回对象
        Result result;
        // 用户ID
        String id = user.getId();
        // 部门ID
        String deptId = updateVo.getDeptId();

        // 非空验证
        if (id == null || "".equals(id) || user == null || deptId == null || "".equals(deptId)) {
            return new Result(1, "必要参数传入为空", null);
        }

        // 根据ID查询数据库
        User personal = userDao.selectByPrimaryKey(id);
        // 返回对象非空
        if (personal == null) {
            result = new Result(1, "查无此人", null);
            return result;
        }
        try {
            // 修改用户信息
            userDao.updateByPrimaryKey(user);
            // 修改：用户-部门中间表信息
            userDao.updateUserDept(updateVo);
            result = new Result(0, "个人资料修改成功", null);
        } catch (Exception e) {   // 修改失败
            e.printStackTrace();
            result = new Result(1, "系统繁忙", null);
        }
        return result;

    }

    public Result loginCheck(LoginVo loginVo) {
        // 返回对象
        Result result;
        // 密码加密
        loginVo.setPassword(DESEDE.encryptIt(loginVo.getPassword()));

        User user = userDao.findUserToCheck(loginVo);
        if (user == null) {
            result = new Result(1, "用户名或密码错误", null);
            return result;
        }
        result = new Result(0, "登录成功", user);
        return result;
    }

    public Result showUserImage(String uid) {
        Result result = null;
        /*
        if ((uid == null) || ("".equals(uid))) {
            result = new Result(1, "系统繁忙", "");
            return result;
        }
        UserImage userImage;
        try {
            userImage = userDao.findByIdFromUserImage(uid);
            if (userImage == null) {
                return new Result(0, "改用户没有上传过头像", "");
            }
            result = new Result(0, "查询成功", userImage.getUserimage());
        } catch (Exception e) {
            e.printStackTrace();
            result = new Result(1, "系统繁忙", "");
        }
        */
        return result;
    }

    public Result imageUpLoad(String uid, String userImage) {
        Result result = null;
        /*
        if ((uid == null) || ("".equals(uid))) {
            result = new Result(1, "用户ID传入错误", null);
            return result;
        }
        UserImage user_image = null;
        try {
            user_image = userDao.findByIdFromUserImage(uid);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(1, "系统繁忙", null);
        }
        if (user_image == null) {
            user_image = new UserImage(uid, userImage);
            try {
                userDao.addToUserImage(user_image);
                result = new Result(0, "图片上传成功", null);
            } catch (Exception e) {
                e.printStackTrace();
                result = new Result(1, "图片上传失败", null);
            }
            return result;
        }
        int update = 0;
        try {
            update = userDao.updateUserImage(uid, userImage);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(1, "系统繁忙", null);
        }
        if (update > 0) {
            result = new Result(0, "图片上传成功", null);
        }
        */
        return result;
    }

    /**
     * 查询用户代办事项数量
     * @update: update on 2017/12/4
     * @param uid 用户ID
     * @return {@link Result}
     */
    public Result getMessages(String uid) {
        Result result = null;
        /*
        if ((uid == null) || ("".equals(uid)) || (userDao.findPersonal(uid) == null)) {
            result = new Result(1, "用户ID传入错误", null);
            return result;
        }
        map_service_messages.clear();

        String deptid = null;
        try {
            deptid = userDao.getString("SELECT d.ID FROM to_horizon_dept d,to_horizon_user u,tor_horizon_user_dept ud WHERE u.ID=ud.USER_ID AND d.ID=ud.DEPT_ID AND u.ID='" +

                    uid + "'");
            deptid = deptid.substring(1, deptid.length() - 1);
        } catch (Exception localException1) {
        }
        String sql_base = "SELECT COUNT(*) FROM TW_HZ_WORKLIST ";

        String where_id = " WHERE (AUTH_ID='" + uid + "' OR AGENT_ID='" + uid + "') ";

        String sql_end = " ORDER BY SENDTIME DESC";

        String sql_db = sql_base + where_id + "AND ISACTIVE = '1' AND STATUS_NO < '200'" + sql_end;

        String sql_ky = sql_base +
                " WHERE (AUTH_ID='" +
                uid +
                "' OR (AUTH_ID='-null-' AND SUBJECTION_ID IN(SELECT u.ID FROM to_horizon_user u))) " +
                "AND STATUS='CReader'" + sql_end;

        String sql_yb = sql_base + where_id + "AND STATUS_NO > 200 AND STATUS_NO < 300 " + sql_end;

        String sql_fq = "SELECT COUNT(*) FROM TW_HZ_INSTANCE WHERE CREATOR in ('U_" + uid + "','" + uid + "') ORDER BY STARTTIME DESC ";

        String sql_yy = sql_base + "WHERE AUTH_ID='" + uid + "' AND STATUS='Readed' " + sql_end;

        String sql_rl = "SELECT COUNT(*) FROM TW_HZ_WORKLIST  WHERE ISCLAIM='1' AND ISACTIVE='1' AND AUTH_ID='-null-' AND SUBJECTION_ID='" + deptid + "'";

        String sql_dy = sql_base +
                "WHERE STATUS='Reader' AND ISACTIVE='1' " +
                "AND (AUTH_ID = '" +
                uid +
                "' OR (AUTH_ID = '-null-' AND SUBJECTION_ID IN (SELECT u.ID FROM to_horizon_user u) AND SUBJECTION_TYPE <> 'S') " +
                "OR (AUTH_ID = '-null-' AND SUBJECTION_ID ='" +
                deptid +
                "' AND SUBJECTION_TYPE = 'S')) " +
                "AND WORKID NOT IN (SELECT WORKID FROM TW_HZ_WorkList WHERE STATUS = 'Readed' AND AUTH_ID = '" +
                uid + "') " + sql_end;

        String sql_cb = "SELECT COUNT(*) FROM TW_HZ_INSTANCE C,TW_HZ_TRACK D WHERE D.WORKID = C.ID AND C.CREATOR like '%" +
                uid +
                "' AND D.FLOWSTATUS = '150' " +
                "ORDER BY C.STARTTIME DESC";
        try {
            map_service_messages.put("gerendaiban_count", Integer.valueOf(userDao.getCount(sql_db)));

            map_service_messages.put("keyueshiyi_count", Integer.valueOf(userDao.getCount(sql_ky)));

            map_service_messages.put("yibanshiyi_count", Integer.valueOf(userDao.getCount(sql_yb)));

            map_service_messages.put("faqishiyi_count", Integer.valueOf(userDao.getCount(sql_fq)));

            map_service_messages.put("yiyueshiyi_count", Integer.valueOf(userDao.getCount(sql_yy)));

            map_service_messages.put("daibanrenling_count", Integer.valueOf(userDao.getCount(sql_rl)));

            map_service_messages.put("daiyueshiyi_count", Integer.valueOf(userDao.getCount(sql_dy)));

            map_service_messages.put("chebanwenjian_count", Integer.valueOf(userDao.getCount(sql_cb)));
        } catch (Exception e) {
            return new Result(1, "系统繁忙", null);
        }
        result = new Result(0, "推送消息查询成功", map_service_messages);
        */
        return result;
    }

    /**
     * 用户上传经纬度，出勤率
     * @update: update on 2017/12/4
     * @param uli {@link UserLongitude}
     * @param attendance 出勤率
     * @return {@link Result}
     */
    public Result longAndLat(UserLongitude uli, Double attendance) {
        Result result = new Result();
        UserVo userVo = new UserVo();
        userVo.setADDRESS("address");
        userVo.setBIRTH_DATE("birthday");
        result.setData(userVo);
/*
        String uid = uli.getUid();

        String longitude = uli.getLongitude();

        String latitude = uli.getLatitude();

        double upl_longitude = 0.0D;

        double upl_latitude = 0.0D;
        if ((uid == null) || ("".equals(uid))) {
            result = new Result(1, "用户ID为空", null);
            return result;
        }
        if ((longitude == null) || (latitude == null) || ("".equals(longitude)) || ("".equals(latitude))) {
            result = new Result(1, "用户上传经纬度为空", null);
            return result;
        }
        try {
            upl_longitude = Double.parseDouble(longitude);
            upl_latitude = Double.parseDouble(latitude);
        } catch (Exception e) {
            return new Result(1, "用户上传经纬度为空", null);
        }
        if ((attendance == null) || (attendance.doubleValue() < 0.0D) || (attendance.doubleValue() > 1.0D)) {
            result = new Result(1, "系统繁忙", null);
            return result;
        }
        User user = userDao.findPersonal(uid);
        if (user == null) {
            result = new Result(1, "用户ID错误", null);
            return result;
        }
        String ROA = new DecimalFormat("0.00%").format(attendance);

        UserLongitude userLongitude = new UserLongitude(uid, longitude, latitude, ROA);

        UserPositionLog upl = null;
        String msg = "";
        try {
            upl = new UserPositionLog(DateUtils.getCurrentDateT("yyyy-MM-dd HH:mm:ss"), uid, user.getNAME(), upl_longitude, upl_latitude, null);
            userDao.addUPL(upl);
        } catch (Exception e1) {
            e1.printStackTrace();
            msg = ",添加用户历史经纬度失败";
        }
        if (userDao.getItudeByUid(uid) == null) {
            try {
                userDao.addLongitude(userLongitude);
                result = new Result(0, "用户经纬度添加成功" + msg, null);
            } catch (Exception e) {
                e.printStackTrace();
                result = new Result(1, "用户经纬度添加失败" + msg, null);
            }
            return result;
        }
        try {
            userDao.updateItudeByUid(userLongitude);
            result = new Result(0, "用户经纬度修改成功" + msg, null);
        } catch (Exception e) {
            e.printStackTrace();
            result = new Result(1, "用户经纬度修改失败" + msg, null);
        }*/
        return result;
    }

    /** PC端获取用户实时经纬度及相关信息
	 * @see com.henghao.service.IUserService#getTitudeToPC()
	 */
    public Result getTitudeToPC() {

        Result result;

        try {
            List<UsrLongAndLatVo> list = userDao.selectUserTitudesDao();
            result = new Result(StatusEnum.SUCCESS_SELECT.getCODE(), StatusEnum.SUCCESS_SELECT.getEXPLAIN(), list);
        } catch (Exception e) {
            e.printStackTrace();
            result = new Result(StatusEnum.SERVER_ERROR.getCODE(), StatusEnum.SERVER_ERROR.getEXPLAIN(), null);
        }
        return result;
    }

    public Result updatePersonal(User user) {
        Result result = null;/*
        String uid = user.getID();
        if ((uid == null) || ("".equals(uid))) {
            result = new Result(1, "用户ID为空", null);
            return result;
        }
        User personal = userDao.findPersonal(uid);
        if (personal == null) {
            result = new Result(1, "查无此人", null);
            return result;
        }
        try {
            User new1 = (User) ObjectUtil.updateNew(personal, user);

            userDao.update(new1);
            result = new Result(0, "个人资料修改成功", null);
        } catch (Exception e) {
            e.printStackTrace();
            result = new Result(1, "系统繁忙", null);
        }*/
        return result;
    }

    public boolean judgeUpload(String uid, String fileName, String extendsName) {/*
        User user = userDao.findPersonal(uid);
        if (user == null) {
            return false;
        }
        if ((fileName == null) || ("".equals(fileName))) {
            return false;
        }
        String extensionName = fileName.substring(fileName.lastIndexOf(".") + 1);
        if ((!"jpg".equals(extensionName)) && (!"png".equals(extensionName))) {
            return false;
        }*/
        return true;
    }

    /**
     * APP用户头像上传
     * @param uid 用户 ID
     * @param file 头像文件名
     * @return {@link Result}
     */
    public Result addUserImage(String uid, MultipartFile file) {

        // 返回对象
        Result result;
        //文件名称
        String fileName = file.getOriginalFilename();
        if (fileName==null || "".equals(fileName)) {
            result = new Result(1, "用户没有上传图片", null);
            return result;
        }
        // 获取图片的扩展名
        String extensionName = fileName.substring(fileName.lastIndexOf(".") + 1);
        // 允许的文件格式
        String allowType = "jpg,png,gif,jpeg";
        if (!allowType.contains(extensionName)) {
            result = new Result(1, "图片格式错误", null);
            return result;
        }
        //进行重命名，解决不同文件重名情况
        String file_ture_name = DateUtils.getCurrentDate("yyyyMMddHHmmssms.")+extensionName;
        try {
            //tomcat服务器路径
            String tomcatPath = System.getProperty("catalina.home");
            //路径分隔符
            String separator = File.separator;
            //存储图片的物理路径
            String realPath = tomcatPath+separator+"webapps"+separator+"uploadImage";
            //图片在本地的路径
            File realFile = new File(realPath, file_ture_name);
            // 如果文件夹不存在，则创一个
            if (!realFile.getParentFile().exists()) {
                realFile.getParentFile().mkdir();
            }
            //保存
            try {
                //将图片保存到物理磁盘中
                file.transferTo(realFile);
                //将图片名称保存到数据库
                userDao.addImageInfo(uid, file_ture_name);
                result = new Result(0, "头像上传成功", null);
            } catch (Exception e) {
                e.printStackTrace();
                result = new Result(1, "头像上传失败，原因：图片保存到数据库时出错", null);
            }
            return result;
        } catch (Exception e) {
            // 保存时错误
            e.printStackTrace();
        }
        return new Result(1, "未知错误", null);
    }


    /**
     * APP端 - 用户修改密码
     * @update: update on 2017/12/4
     * @param up 用户密码包装类
     * @return Result
     */
    public Status updatePassword(UserPassword up) {

        int i = 1/0;
        /*
        // 非空验证
        if (ObjectUtil.propertyIsNull(up))
            // 参数为空
            return new Status(StatusEnum.NO_PRAM.getCODE(), StatusEnum.NO_PRAM.getEXPLAIN());
        */

        userDao.selectByPrimaryKey(up.getUid());
        UserExample example = new UserExample();
        example.or().andIdEqualTo("HZ8bb0c95ce22e77015ce712f4f13842");
        List<User> users = userDao.selectByExample(example);
        System.out.println(users);
        return new Status(StatusEnum.SUCCESS_UPDATE.getCODE(), StatusEnum.SUCCESS_UPDATE.getEXPLAIN());
    }
}
