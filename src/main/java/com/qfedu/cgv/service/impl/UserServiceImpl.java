package com.qfedu.cgv.service.impl;

import com.qfedu.cgv.comment.sysconst.SystemCon;
import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.dao.UserMapper;
import com.qfedu.cgv.entity.User;
import com.qfedu.cgv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserServiceImpl implements UserService {
    @Autowired
    private UserMapper userMapper;

    @Override
    public ResultVo login(String name, String password) {
        User user = userMapper.findByName(name);
        if (user != null) {
            if (user.getPassword().equals(password)) {
                Map<String, Object> map = new HashMap<>();
                map.put("user", user);
                map.put(SystemCon.TOKEN, user.getId());
                return ResultUtil.exec(true, "OK", map);
            }
        }
        return ResultUtil.exec(false, "用户名或密码错误", null);

    }

    @Override
    public ResultVo register(User user) {
        if (userMapper.findByName(user.getName()) == null) {
            int i = userMapper.insertSelective(user);
            if (i > 0) {
                return ResultUtil.exec(true, "OK", null);
            }
        }
        return ResultUtil.exec(false, "用户名重复", null);
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