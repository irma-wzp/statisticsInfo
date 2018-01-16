package com.henghao.dao;

import com.henghao.common.dto.SelectDTO;

/**
 * @author wzp
 * @description 通用查询接口
 * @create on 2018/1/16.
 */
public interface IUniversalDao {

    /**
     *  查询返回唯一结果
     * @author wzp
     * @create on 2018/1/16
     * @param selectDTO 查询sql
     * @return {@link String}
     * @throws Exception e
     */
    String getString(SelectDTO selectDTO) throws Exception;

    /**
     * select count(*) from 类
     * @author wzp
     * @create on 2018/1/16
     * @param selectDTO {@link SelectDTO}
     * @return {@link Integer}
     * @throws Exception e
     */
    Integer getCount(SelectDTO selectDTO) throws Exception;
}
