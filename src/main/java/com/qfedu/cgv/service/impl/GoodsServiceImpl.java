package com.qfedu.cgv.service.impl;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.dao.GoodsMapper;
import com.qfedu.cgv.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/12
 * Time: 22:02
 * Description: No Description
 */
@Service
public class GoodsServiceImpl implements GoodsService {
    @Autowired
    GoodsMapper goodsMapper;
    @Override
    public ResultVo findByType(int type) {
        return ResultUtil.exec(true,"OK",goodsMapper.findByType(type));
    }
}
