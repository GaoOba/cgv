package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.sysconst.SystemCon;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/11
 * Time: 20:28
 * Description: No Description
 */
@RestController
@CrossOrigin(allowedHeaders = SystemCon.TOKEN)
public class MovieController {
    @Autowired
    private MovieService service;

    @GetMapping("movies.do")
    public ResultVo findAll(){return service.findAll();}

    @GetMapping("moviesBystatus.do")
    public ResultVo findByStatus() {
        return service.findByStatus(0);
    }
}
