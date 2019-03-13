package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.service.MessageTypeService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/11
 * Time: 17:43
 * Description: No Description
 */
@Api
@RestController
@CrossOrigin
public class MessageTypeController {
    @Autowired
    private MessageTypeService typeService;


    @ApiOperation(value = "消息中心")
    @GetMapping("messageTypeList.do")
    public ResultVo findAll(){
        return typeService.findAll();
    }
}
