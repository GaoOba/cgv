package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.sysconst.SystemCon;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.service.MessageService;
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
@RestController
@CrossOrigin
public class MessageController {
    @Autowired
    private MessageService messageService;

    @PostMapping("message.do")
    public ResultVo findMessage(HttpServletRequest request, int typeId){
        String token = request.getParameter(SystemCon.TOKEN);
        return messageService.findById(Integer.parseInt(token), typeId);
    }
}
