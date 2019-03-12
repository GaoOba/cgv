package com.qfedu.cgv.service;

import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.entity.Message;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/11
 * Time: 18:01
 * Description: No Description
 */
public interface MessageService {
    public ResultVo findById(int uId, int typeId);
}
