package com.qfedu.cgv.service.impl;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.dao.MessageTypeMapper;
import com.qfedu.cgv.service.MessageTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/11
 * Time: 17:40
 * Description: No Description
 */
@Service
public class MessageTypeServiceImpl implements MessageTypeService {
    @Autowired
    private MessageTypeMapper typeMapper;
    @Override
    public ResultVo findAll() {
        return ResultUtil.exec(true,"OK",typeMapper.findAll());
    }
}
