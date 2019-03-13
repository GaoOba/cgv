package com.qfedu.cgv.controller;


import com.qfedu.cgv.comment.sysconst.SystemCon;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.service.CouponsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@Api
@RequestMapping("/couponse")
@CrossOrigin
@RestController
public class CouponseController {

    @Autowired
    private CouponsService couService;


    @ApiOperation(value = "展示优惠券列表")
    @GetMapping("/findAll.do")
    public ResultVo findCouponseByTypeAndID(@ApiParam(name = "token", value = "token令牌")  String token, @ApiParam(name = "type", value = "优惠券类型（1 优惠券 2 代金券）") int type) {

        return couService.findAllCoupons(type, Integer.parseInt(token));
    }

}
