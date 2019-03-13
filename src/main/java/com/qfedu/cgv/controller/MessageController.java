package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.sysconst.SystemCon;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.service.MessageService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.Enumeration;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/11
 * Time: 18:04
 * Description: No Description
 */
@Api
@RestController
@CrossOrigin
public class MessageController {
    @Autowired
    private MessageService messageService;

    @ApiOperation(value = "我的消息")
    @PostMapping("message.do")
    public ResultVo findMessage(@ApiParam(name="token",value = "token令牌") String token, @ApiParam(name = "typeid", value = "消息种类名") int typeId){
        return messageService.findById(Integer.parseInt(token), typeId);
    }
}
