package com.qfedu.cgv.service;

import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.entity.User;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/9
 * Time: 11:10
 * Description: No Description
 */
public interface UserService {
    public ResultVo login(String name, String password);

    ResultVo register(User user);

    ResultVo validate(String name);

    ResultVo update(User user);
}
