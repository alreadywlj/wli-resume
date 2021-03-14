package com.wli.core.rsponse;

/**
 * @param <T>
 */
public class R<T> {

    private Integer code;

    private String msg;

    private long timep;

    private T data;


    public R(Integer code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.timep = timep;
        this.data = data;
    }

    public R(IRCode rcode, T data) {
        this.code = rcode.getCode();
        this.msg = rcode.getMsg();
        this.timep = timep;
        this.data = data;
    }


    public static <T> R<T> success(T data) {
        return new R<T>(RCodeEnum.SUCCESS, data);
    }


    public static <T> R<T> fail(T data) {
        return new R<T>(RCodeEnum.FAIL, null);
    }

    public static <T> R<T> rsp(IRCode irCode, T data) {
        return new R<T>(irCode.getCode(), irCode.getMsg(), data);
    }

    public Integer getCode() {
        return code;
    }

    @Override
    public String toString() {
        return "R{" +
                "code=" + code +
                ", msg='" + msg + '\'' +
                ", timep=" + timep +
                ", data=" + data +
                '}';
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

    public long getTimep() {
        return timep;
    }

    public void setTimep(long timep) {
        this.timep = System.currentTimeMillis();
    }

    public T getData() {
        return data;
    }

    public void setData(T data) {
        this.data = data;
    }
}
