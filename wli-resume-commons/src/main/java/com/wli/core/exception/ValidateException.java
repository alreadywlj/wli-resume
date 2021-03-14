package com.wli.core.exception;

import com.wli.core.rsponse.IRCode;

public class ValidateException extends RuntimeException {

    private Integer code;

    private String msg;


    public ValidateException(int code, String msg) {
        super(msg);
        this.code = code;
    }

    public ValidateException(IRCode statusCode) {
        super(statusCode.getMsg());
        this.code = statusCode.getCode();
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

}
