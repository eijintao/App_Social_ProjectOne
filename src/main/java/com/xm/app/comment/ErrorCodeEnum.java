package com.xm.app.comment;

/**
 * @author Mei Jintao
 * @date 2019/9/10 15:24
 */
public enum ErrorCodeEnum {

    /**
     * 错误代码及信息
     */
    PARAMETER_ERROR(10000, "参数错误"),
    ILLEGAL_OPERATION(10001, "非法操作"),
    DB_EXCEPTION(10002, "数据库访问异常"),
    TOKEN_EXPIRED(10003, "Token过期，请重新登录"),
    TOKEN_VALID(10004, "Token校验不通过,请重新登录"),
    DB_EXIST_SAME_RECORD(10005, "新添加记录已存在"),
    BUSINESS_ERROR(10006, "业务逻辑出错"),
    VALIDATE_CODE_ERROR(10007, "验证码错误"),
    TOKEN_MISMATCH_USER(10008, "Token与当前用户id不匹配");

    private Integer code;
    private String message;

    ErrorCodeEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public Integer getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }

}
