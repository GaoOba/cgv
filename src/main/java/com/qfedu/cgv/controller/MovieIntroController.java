package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.service.MovieIntroService;
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
public class MovieIntroController {
    @Autowired
    private MovieIntroService service;

    @GetMapping("movieintro.do")
    public ResultVo findByMid(int mid){
        return ResultUtil.exec(true,"OK",service.findByMid(mid));
    }
}
