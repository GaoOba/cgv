package com.qfedu.cgv.service;

import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.entity.UserMovie;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/11
 * Time: 22:36
 * Description: No Description
 */
public interface UserMovieService {
    ResultVo findById(int id);

    ResultVo insert(UserMovie userMovie);

    ResultVo delLike(int uid, int mid);
}
