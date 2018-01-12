package com.henghao.common.result;

import lombok.Data;

/**
 * @author wzp
 * @description: 状态返回结果
 * @update on 2017/12/3.
 */
@Data
public class Status implements java.io.Serializable {

    private static final long serialVersionUID = 6789149581293124528L;
    //状态码
    private int status;
    //描述
    private String msg;

    /**
     * 空构造
     */
    public Status() {

    }

    /**
     * 全参数构造
     */
    public Status(int status, String msg) {
        this.status = status;
        this.msg = msg;
    }
}
