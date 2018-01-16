package com.henghao.common.domain.universal;

import lombok.Data;

import java.io.Serializable;
import java.util.List;

/**
 * 通用查询DO类
 * @description DO（Data Object） ：与数据库表结构一一对应，通过 DAO 层向上传输数据源对象。
 * @author wzp
 * @create on 2018/1/16.
 */
@Data
public class UniversalDO<T> implements Serializable{
    private static final long serialVersionUID = -3665208351512819703L;

    private String string;
    private List<String> strings;
    private T dto;
    private List<T> dtos;
}
