package com.qfedu.cgv.service.impl;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.dao.UserCouponsMapper;
import com.qfedu.cgv.entity.UserCoupons;
import com.qfedu.cgv.service.UserCouponsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserCouponsServiceImpl implements UserCouponsService {
    @Autowired
    private UserCouponsMapper ucDao;

    @Override
    public ResultVo add(UserCoupons userCoupons) {

        if (!userCoupons.getUid().equals("") && userCoupons.getUid() != null) {

            ucDao.insertSelective(userCoupons);

            return ResultUtil.exec(true, "OK", "添加成功");
        }else {
            return ResultUtil.exec(true, "OK", "添加失败");
        }
    }
}
