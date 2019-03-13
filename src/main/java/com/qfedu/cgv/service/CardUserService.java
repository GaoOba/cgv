package com.qfedu.cgv.service;

import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.entity.CardUser;

import javax.xml.transform.Result;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/12
 * Time: 22:15
 * Description: No Description
 */
public interface CardUserService {
    ResultVo insert(CardUser cardUser);
}
