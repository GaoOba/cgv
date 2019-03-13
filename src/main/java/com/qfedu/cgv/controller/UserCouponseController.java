package com.qfedu.cgv.controller;


import com.qfedu.cgv.comment.sysconst.SystemCon;
import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.entity.UserCoupons;
import com.qfedu.cgv.service.UserCouponsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/UserCoupons")

public class UserCouponseController {

    @Autowired
    private UserCouponsService ucService;



    @PostMapping("/add.do")
    public ResultVo add(HttpServletRequest request, UserCoupons userCoupons) {

        String token = request.getParameter(SystemCon.TOKEN);

        userCoupons.setUid(Integer.parseInt(token));

        return ucService.add(userCoupons);




    }

}
