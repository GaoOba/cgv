package com.qfedu.cgv.service;

import com.qfedu.cgv.comment.vo.ResultVo;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/12
 * Time: 21:59
 * Description: No Description
 */
public interface GoodsService {
    ResultVo findByType(int type);
}
