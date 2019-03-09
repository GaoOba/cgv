package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/9
 * Time: 20:00
 * Description: No Description
 */
@RestController
public class ActivityController {
    @Autowired
    ActivityService activityService;

    @GetMapping("activityList.do")
    public ResultVo findAll(){
        return activityService.findAll();
    }
}
