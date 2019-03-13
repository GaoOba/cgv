package com.qfedu.cgv.controller;


import com.qfedu.cgv.comment.sysconst.SystemCon;
import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.entity.UserCoupons;
import com.qfedu.cgv.service.UserCouponsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;


@Api
@RestController
@RequestMapping("/UserCoupons")

public class UserCouponseController {

    @Autowired
    private UserCouponsService ucService;




    @ApiOperation(value = "添加优惠券", notes = "添加优惠券到我的优惠券中")
    @PostMapping("/add.do")
    public ResultVo add(@ApiParam(name = "token", value = "token令牌") String token, @ApiParam(name= "cid",value = "优惠券ID") UserCoupons userCoupons) {


        userCoupons.setUid(Integer.parseInt(token));

        return ucService.add(userCoupons);




    }

}
