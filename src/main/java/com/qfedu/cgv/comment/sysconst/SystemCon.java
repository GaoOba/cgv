package com.qfedu.cgv.comment.sysconst;

import java.util.HashMap;
import java.util.Map;

public class SystemCon {
    //   编码
    public  static final int OK = 1;
    public static final int ERROR = 100;
    //登录令牌
    public static final String TOKEN = "cgv_app_token";
    public static final Map<String,Object> map = new HashMap<>();
    static {
        map.put(TOKEN,null);
    }
}
