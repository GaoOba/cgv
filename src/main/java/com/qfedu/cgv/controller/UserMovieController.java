package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.sysconst.SystemCon;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.entity.UserMovie;
import com.qfedu.cgv.service.UserMovieService;
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
@RestController
@CrossOrigin
public class UserMovieController {
    @Autowired
    private UserMovieService service;

    @GetMapping("likeMovie.do")
    public ResultVo findById(HttpServletRequest request){
        String uid = request.getHeader(SystemCon.TOKEN);
        return service.findById(Integer.parseInt(uid));
    }

    @GetMapping("addLike.do")
    public ResultVo addLike(HttpServletRequest request,int movieid){
        String uid = request.getHeader(SystemCon.TOKEN);
        UserMovie userMovie = new UserMovie();
        userMovie.setMid(movieid);
        userMovie.setUid(Integer.parseInt(uid));
        return service.insert(userMovie);
    }
}
