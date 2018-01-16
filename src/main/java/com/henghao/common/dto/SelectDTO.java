package com.henghao.common.dto;

import lombok.Data;

import java.io.Serializable;
/**
 * 通用查询 sql 传输
 * @author wzp
 * @description DTO（Data Transfer Object） ：数据传输对象， Service 或 Manager 向外传输的对象。
 * @create on 2018/1/16.
 */
@Data
public class SelectDTO implements Serializable{
    private static final long serialVersionUID = 5801639660326093504L;

    private String sql;

    public SelectDTO(String sql) {
        this.sql = sql;
    }
}
