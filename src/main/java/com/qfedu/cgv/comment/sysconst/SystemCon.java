package com.qfedu.cgv.comment.sysconst;

import java.util.HashMap;
import java.util.Map;

public class SystemCon {
    //   编码
    public  static final int OK = 1;
    public static final int ERROR = 100;

    public static final Map<String,String> map = new HashMap<>();
    static {
        map.put("token","cgv_token_java");
    }
}
