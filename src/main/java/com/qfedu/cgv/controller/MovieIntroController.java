package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.service.MovieIntroService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/13
 * Time: 18:29
 * Description: No Description
 */
@RestController
@RequestMapping("/intro")
@CrossOrigin
@Api(value = "电影详情展示",tags = "详情展示接口")
public class MovieIntroController {
    @Autowired
    private MovieIntroService service;

    @ApiOperation(value = "展示电影",notes = "电影ID不能为空")
    @GetMapping("movieintro.do")
    public ResultVo findByMid(@ApiParam(name = "mid",value = "电影ID") int mid){
        return ResultUtil.exec(true,"OK",service.findByMid(mid));
    }
}
