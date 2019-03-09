package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.entity.User;
import com.qfedu.cgv.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
    @Autowired
    private UserService service;

    @PostMapping("userlogin.do")
    public ResultVo login(String name, String password){
        ResultVo resultVo = service.login(name, password);
        return resultVo;
    }
    @PostMapping("register.do")
    public ResultVo register(User user){
        return service.register(user);
    }
    @PostMapping("username.do")
    public ResultVo username(String name){
        return service.validate(name);
    }
}
