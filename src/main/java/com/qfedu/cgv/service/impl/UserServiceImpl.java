package com.qfedu.cgv.service.impl;

import com.qfedu.cgv.comment.sysconst.SystemCon;
import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.dao.UserMapper;
import com.qfedu.cgv.entity.User;
import com.qfedu.cgv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultVo login(String name, String password) {
        User user1 = userMapper.findByName(name);
        if (user1 != null) {
            if (user1.getPassword().equals(password)) {
                return ResultUtil.execLogin(true, "OK", user1, SystemCon.map.get("token"));
            }
        }
        return ResultUtil.exec(false, "用户名或密码错误", null);

    }

    @Override
    public ResultVo register(User user) {
        int i = userMapper.insertSelective(user);
        if (i > 0) {
            return ResultUtil.exec(true, "OK", null);
        }
        return ResultUtil.exec(false, "注册失败", null);
    }

    @Override
    public ResultVo validate(String name) {
        User user = userMapper.findByName(name);
        if (user != null) {
            if (user.getName() != null) {
                return ResultUtil.exec(false, "用户名已存在", null);
            }
        }
        return ResultUtil.exec(true, "OK", null);
    }
}