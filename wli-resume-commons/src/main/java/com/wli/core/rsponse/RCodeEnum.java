package com.wli.core.rsponse;

public enum RCodeEnum implements IRCode {


    SUCCESS(200, "SUCCES"),
    FAIL(201, "FAIL");

    private Integer code;
    private String msg;

    RCodeEnum(Integer code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public Integer getCode() {
        return code;
    }


    public String getMsg() {
        return msg;
    }


}
