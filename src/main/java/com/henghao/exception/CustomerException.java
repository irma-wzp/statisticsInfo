package com.henghao.exception;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

/**
 * @author wzp
 * @description 自定义异常信息类
 * @create on 2017/12/19.
 */
@Data
@EqualsAndHashCode(callSuper = false)
//@EqualsAndHashCode
public class CustomerException extends Exception implements Serializable{

    private static final long serialVersionUID = 5468941608280259762L;

    private String message;//异常信息

    /**
     * 构造函数
     * @param message 异常信息
     */
    public CustomerException(String message) {
        this.message = message;
    }
}
