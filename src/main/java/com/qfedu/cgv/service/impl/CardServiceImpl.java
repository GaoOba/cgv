package com.qfedu.cgv.service.impl;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.dao.CardMapper;
import com.qfedu.cgv.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/12
 * Time: 22:10
 * Description: No Description
 */
@Service
public class CardServiceImpl implements CardService {
    @Autowired
    private CardMapper cardMapper;
    @Override
    public ResultVo findAll() {
        return ResultUtil.exec(true,"OK",cardMapper.findAll());
    }
}
