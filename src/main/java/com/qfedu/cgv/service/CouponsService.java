package com.qfedu.cgv.service;

import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.entity.Coupons;

import java.util.List;

public interface CouponsService {

    public ResultVo findAllCoupons(int type, int userid);
}
