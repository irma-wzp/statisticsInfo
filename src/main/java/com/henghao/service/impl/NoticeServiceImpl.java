package com.henghao.service.impl;

import com.henghao.domain.entity.result.Result;
import com.henghao.service.INoticeService;

import org.springframework.stereotype.Service;

@Service("noticeService")
public class NoticeServiceImpl implements INoticeService {
    public Result findToPC() {
        return null;
    }

    
    public Result getIsReadList(String paramString1, String paramString2) throws Exception {
        return null;
    }

    
    public Result MarkAsRead(String paramString1, String paramString2) {
        return null;
    }

    
    public Result deleteNotice(String paramString1, String paramString2) {
        return null;
    }

    
    public Result updateReadAll(String paramString) {
        return null;
    }
//    @Resource
//    private INoticeDao noticeDao;
/*
    public Result getIsReadList(String uid, String isRead)
            throws Exception {
        Result result = null;
        if ((uid == null) || ("".equals(uid))) {
            result = new Result(1, "系统繁忙", null);
            return result;
        }
        List<String> gidList = null;

        gidList = this.noticeDao.getUserUnread(uid);
        if (gidList.size() < 1) {
            result = new Result(1, "该用户还没有收到公告", null);
            return result;
        }
        for (int i = 0; i < gidList.size(); i++) {
            String gid = (String) gidList.get(i);
            User_Notice user_Notice = this.noticeDao.findUser_Notice(uid, gid);
            if (user_Notice == null) {
                user_Notice = new User_Notice(gid, uid, "0", "0");
                this.noticeDao.addUser_Notice(user_Notice);
            }
        }
        result = new Result(0, "查询成功", this.noticeDao.getUnreadList(uid, isRead));
        return result;
    }

    public Result MarkAsRead(String gid, String uid) {
        Result result = null;
        if ((gid == null) || ("".equals(gid))) {
            result = new Result(1, "公告ID不能为空", null);
            return result;
        }
        if ((uid == null) || ("".equals(uid))) {
            result = new Result(1, "系统繁忙", null);
            return result;
        }
        User_Notice user_Notice = null;
        try {
            user_Notice = this.noticeDao.findUser_Notice(uid, gid);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(1, "系统繁忙", null);
        }
        if (user_Notice == null) {
            result = new Result(1, "没有这条公告", null);
            return result;
        }
        if (user_Notice.getUser_isRead().equals("1")) {
            result = new Result(1, "该公告已经是已读状态，无需标记", null);
            return result;
        }
        int update = 0;
        try {
            update = this.noticeDao.updateNoticeIsRead(uid, gid);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(1, "系统繁忙", null);
        }
        result = new Result(0, update + "条标记为已读成功", null);
        return result;
    }

    public Result deleteNotice(String gid, String uid) {
        Result result = null;
        if ((gid == null) || ("".equals(gid))) {
            result = new Result(1, "公告ID不能为空", null);
            return result;
        }
        if ((uid == null) || ("".equals(uid))) {
            result = new Result(1, "系统繁忙", null);
            return result;
        }
        User_Notice user_Notice = null;
        try {
            user_Notice = this.noticeDao.findUser_Notice(uid, gid);
        } catch (Exception e1) {
            e1.printStackTrace();
            return new Result(1, "系统繁忙", null);
        }
        if ((user_Notice == null) || ("1".equals(user_Notice.getUser_isDelete()))) {
            result = new Result(1, "公告已删除或公告不存在", null);
            return result;
        }
        try {
            user_Notice.setUser_isDelete("1");
            this.noticeDao.deleteUser_Notice(user_Notice);
        } catch (Exception e) {
            e.printStackTrace();
            return new Result(1, "系统繁忙", null);
        }
        result = new Result(0, "删除成功", null);
        return result;
    }

    public Result updateReadAll(String uid) {
        Result result = null;
        if ((uid == null) || ("".equals(uid))) {
            result = new Result(1, "系统繁忙", null);
            return result;
        }
        List<NoticeVo> list = null;
        try {
            list = this.noticeDao.getUnreadList(uid, "0");
        } catch (Exception e) {
            return new Result(1, "系统繁忙", null);
        }
        if (list.size() < 1) {
            result = new Result(1, "此用户没有未读公告", null);
            return result;
        }
        try {
            int readAll = this.noticeDao.updateReadAll(uid);
            result = new Result(0, uid + "用户：" + readAll + "条全部标记为已读成功", Integer.valueOf(readAll));
        } catch (Exception e) {
            e.printStackTrace();
            result = new Result(1, "全部标记为已读是出错", null);
        }
        return result;
    }

    public Result findToPC() {
        Result result = null;
        try {
            Map<String, Object> map = this.noticeDao.findToPC();
            result = new Result(0, "查询最新公告成功", map);
        } catch (Exception e) {
            result = new Result(1, "查询最新公告出错", null);
        }
        return result;
    }*/
}
