package com.qfedu.cgv.comment.vo;

/**
 *@Author feri
 *@Date Created in 2019/2/19 10:24
 */
public class ResultVo {
    private int code;

    private String msg;

    private Object data;

    private String token;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }
}
