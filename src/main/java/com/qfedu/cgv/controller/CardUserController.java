package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.sysconst.SystemCon;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.entity.CardUser;
import com.qfedu.cgv.service.CardUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
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
@RestController
@RequestMapping("/carduser")
@CrossOrigin
public class CardUserController {
    @Autowired
    CardUserService service;

    @RequestMapping("addCard.do")
    public ResultVo addCard(int cardid, HttpServletRequest request){
        String uid = request.getParameter(SystemCon.TOKEN);
        CardUser cardUser = new CardUser();
        cardUser.setCid(cardid);
        cardUser.setUid(Integer.parseInt(uid));
        return service.insert(cardUser);
    }
}
