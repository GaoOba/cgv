package com.qfedu.cgv.controller;


import com.qfedu.cgv.comment.sysconst.SystemCon;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.service.CouponsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;
@RequestMapping("/couponse")
@RestController
public class CouponseController {

    @Autowired
    private CouponsService couService;


    @GetMapping("/findAll.do")
    public ResultVo findCouponseByTypeAndID(HttpServletRequest request, int type) {

        String token = request.getHeader(SystemCon.TOKEN);


        ResultVo vo = couService.findAllCoupons(type, Integer.parseInt(token));
        return vo;
    }

}
