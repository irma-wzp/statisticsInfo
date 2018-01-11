package com.henghao.service;

import com.henghao.domain.entity.result.Result;

public interface INoticeService {
    Result findToPC();

    Result getIsReadList(String paramString1, String paramString2)
            throws Exception;

    Result MarkAsRead(String paramString1, String paramString2);

    Result deleteNotice(String paramString1, String paramString2);

    Result updateReadAll(String paramString);
}
