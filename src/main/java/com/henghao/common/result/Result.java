package com.henghao.common.result;

import lombok.Data;
import java.io.Serializable;

@Data
/**
 * @author wzp
 * @description: 接口返回类
 * @create on 2017/12/3.
 */
public class Result implements Serializable{

    private static final long serialVersionUID = -4035870287304824487L;

    private int status;     // 状态(0:正常，1:有异常)
    private String msg;     // 消息
    private Object data;    // 数据


    /**
     * 空构造
     */
    public Result() {
    }

    /**
     * 全构造
     *
     * @param status 状态
     * @param msg 消息
     * @param data 数据
     */
    public Result(int status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }


}
