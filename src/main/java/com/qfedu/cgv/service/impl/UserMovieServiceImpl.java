package com.qfedu.cgv.service.impl;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.dao.UserMovieMapper;
import com.qfedu.cgv.entity.Movie;
import com.qfedu.cgv.entity.UserMovie;
import com.qfedu.cgv.service.UserMovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/11
 * Time: 22:37
 * Description: No Description
 */
@Service
public class UserMovieServiceImpl implements UserMovieService {
    @Autowired
    UserMovieMapper userMovieMapper;

    @Override
    public ResultVo findById(int id) {
        return ResultUtil.exec(true, "OK", userMovieMapper.findById(id));
    }

    @Override
    public ResultVo insert(UserMovie userMovie) {
        int i = userMovieMapper.countMovie(userMovie.getUid(), userMovie.getMid());
        if (i == 0){
        return ResultUtil.exec(true, "OK", userMovieMapper.insert(userMovie));
        } else {
        return ResultUtil.exec(false, "电影已存在", null);
        }
    }

    @Override
    public ResultVo delLike(int uid, int mid) {
        return ResultUtil.exec(true,"OK",userMovieMapper.deleteById(uid, mid));
    }
}
