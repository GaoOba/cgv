package com.qfedu.cgv.service.impl;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.dao.MessageMapper;
import com.qfedu.cgv.entity.Message;
import com.qfedu.cgv.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/11
 * Time: 18:02
 * Description: No Description
 */
@Service
public class MessageServiceImpl implements MessageService {
    @Autowired
    private MessageMapper messageMapper;
    @Override
    public ResultVo findById(int uId, int typeId) {
        return ResultUtil.exec(true,"OK",messageMapper.findById(uId,typeId));
    }
}
