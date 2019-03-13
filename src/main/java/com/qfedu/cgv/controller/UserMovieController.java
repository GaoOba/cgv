package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.sysconst.SystemCon;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.entity.UserMovie;
import com.qfedu.cgv.service.UserMovieService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/11
 * Time: 22:40
 * Description: No Description
 */
@Api
@RestController
@CrossOrigin
public class UserMovieController {
    @Autowired
    private UserMovieService service;

    @ApiOperation(value = "展示我想看")
    @PostMapping("likeMovie.do")
    public ResultVo findById(@ApiParam(name = "token",value = "token令牌") String token){
        return service.findById(Integer.parseInt(token));
    }

    @ApiOperation(value = "添加我想看")
    @PostMapping("addLike.do")
    public ResultVo addLike(@ApiParam(name = "token",value = "token令牌") String token, @ApiParam(name = "movieid", value = "电影id") int movieid){
        UserMovie userMovie = new UserMovie();
        userMovie.setMid(movieid);
        userMovie.setUid(Integer.parseInt(token));
        return service.insert(userMovie);
    }

    @ApiOperation(value = "删除我想看")
    @PostMapping("delLike.do")
    public ResultVo delLike(@ApiParam(name = "token",value = "token令牌") String token,@ApiParam(name = "movieid", value = "电影id")int movieid){
        return service.delLike(Integer.parseInt(token),movieid);
    }
}
