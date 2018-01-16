package com.henghao.common.vo;

import lombok.Data;

/**
 * 用户代办事项数量信息包装类
 * @author wzp
 * @description VO（View Object） ：显示层对象，通常是 Web 向模板渲染引擎层传输的对象。
 * @create on 2018/1/16.
 */
@Data
public class MyMessageVO implements java.io.Serializable {

    private static final long serialVersionUID = 7609948165024466717L;

    // 个人代办
    private int gerendaiban_count;
    // 可阅事宜
    private int keyueshiyi_count;
    // 已办事宜
    private int yibanshiyi_count;
    // 发起事宜
    private int faqishiyi_count;
    // 已阅事宜
    private int yiyueshiyi_count;
    // 代办认领
    private int daibanrenling_count;
    // 待阅事宜
    private int daiyueshiyi_count;
    // 撤办文件
    private int chebanwenjian_count;


}
