package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.service.CardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/12
 * Time: 22:12
 * Description: No Description
 */
@RestController
@RequestMapping("/card")
@CrossOrigin
public class CardController {
    @Autowired
    private CardService service;

    @RequestMapping("cardList.do")
    public ResultVo findAll(){
        return service.findAll();
    }
}
