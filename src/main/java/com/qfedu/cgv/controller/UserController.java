package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.entity.User;
import com.qfedu.cgv.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@Api(value="用户相关接口",tags = "用户相关操作")
public class UserController {

    @Autowired
    private UserService service;
    @ApiOperation(value = "用户登录",notes = "用户名密码不能为空")
    @PostMapping("userlogin.do")
    public ResultVo login(String name, String password){
        return service.login(name, password); }
    @PostMapping("register.do")
    public ResultVo register(User user){
        return service.register(user);
    }
    @PostMapping("username.do")
    public ResultVo username(String name){
        return service.validate(name);
    }
}
