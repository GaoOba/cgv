package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.service.GoodsTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/12
 * Time: 21:40
 * Description: No Description
 */
@Api
@RestController
@RequestMapping("/goodstype")
@CrossOrigin
public class GoodsTypeController {
    @Autowired
    GoodsTypeService service;

    @ApiOperation(value = "展示卖品详情")
    @GetMapping("typeList.do")
    public ResultVo findType(){
        return service.findAll();
    }
}
