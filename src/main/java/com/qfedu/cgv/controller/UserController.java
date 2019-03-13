package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.entity.User;
import com.qfedu.cgv.service.UserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
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
    public ResultVo login(@ApiParam(name = "name", value = "用户名") String name, @ApiParam(name = "password",value = "密码") String password){
        return service.login(name, password); }


    @ApiOperation(value = "用户注册",notes = "记得加非空验证")
    @PostMapping("register.do")
    public ResultVo register(@ApiParam(name="User",value = "user对象") User user){
        return service.register(user);
    }

    @ApiOperation(value = "用户名是否重复验证接口", tags = "名字不能为空")
    @PostMapping("username.do")
    public ResultVo username(@ApiParam(name = "name", value = "名字") String name){
        return service.validate(name);
    }

    @PostMapping("update.do")
    public ResultVo update(User user){
        return service.update(user);
    }
}
