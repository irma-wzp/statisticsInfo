package com.henghao.common.result;

/**
 * @author wzp
 * @description: 状态 - 枚举类
 * @update on 2017/12/7.
 */
public enum StatusEnum {

    CHECK_DATA(407, "请正确填写信息后重试"),

    ERROR(505, "错误操作"),
    ERROR_DATABASE(500,"执行数据库操作时发生错误"),
    ERROR_FILE(502, "文件解析错误"),
    ERROR_PRAM(87,"参数错误"),
    ERROR_SERVER(504, "发生不可预知的错误"),
    ERROR_UNKNOWN(503, "未知错误"),

    FAILD(501, "失败"),
    FILE_FORMAT(603, "文件格式不正确"),
    FILE_NO_DATA(404, "未解析到文件中的数据，或文件中的数据为空"),
    FILE_SIZE(601, "文件大小不符合要求"),
    FILE_UPLOAD(600, "文件上传失败，请重试"),

    NO_DATA(404, "无数据"),
    NO_FILE(604, "文件不能为空"),
    NO_FILE_DATA(404, "无可用数据导出"),
    NO_PRAM(400, "必要参数为空"),
    NO_RIGHTS(401, "该用户无法操作此功能"),
    NO_URL(404, "URL地址错误"),

    SUCCESS(0, "成功"),
    SUCCESS_UPLOAD(0, "上传成功"),
    SUCCESS_ADD(0,"添加成功"),
    SUCCESS_DEL(0,"删除成功"),
    SUCCESS_SELECT(0,"查询成功"),
    SUCCESS_UPDATE(0,"修改成功");



    private final int CODE;
    private final String EXPLAIN;

    StatusEnum(int CODE, String EXPLAIN) {
        this.CODE = CODE;
        this.EXPLAIN = EXPLAIN;
    }

    public int getCODE() {
        return CODE;
    }

    public String getEXPLAIN() {
        return EXPLAIN;
    }

}
