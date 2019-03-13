package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/12
 * Time: 22:04
 * Description: No Description
 */
@RestController
@RequestMapping("/goods")
@CrossOrigin
public class GoodsController {
    @Autowired
    private GoodsService service;

    @RequestMapping("goodsByType.do")
    public ResultVo findByType(int type){
        return service.findByType(type);
    }
}
