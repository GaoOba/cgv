package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.service.GoodsTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/12
 * Time: 21:40
 * Description: No Description
 */
@RestController
@RequestMapping("/goodstype")
@CrossOrigin
public class GoodsTypeController {
    @Autowired
    GoodsTypeService service;

    @RequestMapping("typeList.do")
    public ResultVo findType(){
        return service.findAll();
    }
}
