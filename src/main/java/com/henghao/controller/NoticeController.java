package com.henghao.controller;

import com.henghao.domain.entity.result.Result;
import com.henghao.service.INoticeService;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping({"/notice"})
/**
 * @author wzp
 * @description: 公告控制层
 * @update on 2017/12/3.
 */
public class NoticeController {

    @Resource
    private INoticeService noticeService;

    @RequestMapping(value = {"/findLatest"}, produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Result findLatest() {
        Result result = this.noticeService.findToPC();
        return result;
    }

    @RequestMapping(value = {"/findUnRead"}, produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Result findUnRead(String uid) {
        Result result = null;
        try {
            result = this.noticeService.getIsReadList(uid, "0");
        } catch (Exception e) {
            result = new Result(1, "系统繁忙", null);
        }
        return result;
    }

    @RequestMapping(value = {"/findReadAlready"}, produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Result findReadAlready(String uid) {
        Result result = null;
        try {
            result = this.noticeService.getIsReadList(uid, "1");
        } catch (Exception e) {
            result = new Result(1, "系统繁忙", null);
        }
        return result;
    }

    @RequestMapping(value = {"/MarkAsRead"}, produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Result MarkAsRead(String gid, String uid) {
        Result result = this.noticeService.MarkAsRead(gid, uid);
        return result;
    }

    @RequestMapping(value = {"/ReadAll"}, produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Result ReadAll(String uid) {
        return this.noticeService.updateReadAll(uid);
    }

    @RequestMapping(value = {"/deleteNotice"}, produces = {"application/json;charset=utf-8"})
    @ResponseBody
    public Result deleteNotice(String gid, String uid) {
        Result result = this.noticeService.deleteNotice(gid, uid);
        return result;
    }
}
