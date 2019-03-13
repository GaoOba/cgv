package com.qfedu.cgv.service.impl;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.dao.CardUserMapper;
import com.qfedu.cgv.entity.CardUser;
import com.qfedu.cgv.service.CardUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/12
 * Time: 22:16
 * Description: No Description
 */
@Service
public class CardUserServiceImpl implements CardUserService {
    @Autowired
    CardUserMapper cardUserMapper;
    @Override
    public ResultVo insert(CardUser cardUser) {
        return ResultUtil.exec(true,"OK",cardUserMapper.insert(cardUser));
    }
}
