package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.sysconst.SystemCon;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.entity.CardUser;
import com.qfedu.cgv.service.CardUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/12
 * Time: 22:19
 * Description: No Description
 */
@Api
@RestController
@RequestMapping("/carduser")
@CrossOrigin
public class CardUserController {
    @Autowired
    CardUserService service;

    @ApiOperation(value = "购买会员卡")
    @PostMapping("addCard.do")
    public ResultVo addCard(@ApiParam(name = "cardid", value = "会员卡id") int cardid, @ApiParam(name = "token", value = "token令牌") String token){
        CardUser cardUser = new CardUser();
        cardUser.setCid(cardid);
        cardUser.setUid(Integer.parseInt(token));
        return service.insert(cardUser);
    }
}
