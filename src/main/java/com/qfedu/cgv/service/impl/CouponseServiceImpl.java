package com.qfedu.cgv.service.impl;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.dao.CouponsMapper;
import com.qfedu.cgv.entity.Coupons;
import com.qfedu.cgv.service.CouponsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class CouponseServiceImpl implements CouponsService {

    @Autowired
    private CouponsMapper couDao;


    @Override
    public ResultVo findAllCoupons(int type, int userid) {
        List<Coupons> list = couDao.findAllByTypeAndUserid(type,userid);

        return ResultUtil.exec(true,"OK",list);
    }
}
