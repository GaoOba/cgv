package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.sysconst.SystemCon;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.service.ActivityService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/9
 * Time: 20:00
 * Description: No Description
 */
@Api
@RestController
@CrossOrigin(allowedHeaders = SystemCon.TOKEN)
public class ActivityController {
    @Autowired
    ActivityService activityService;


    @ApiOperation(value = "线上活动")
    @GetMapping("onlineActivity.do")
    public ResultVo findOnline(){
        return activityService.findOnline();
    }


    @ApiOperation(value = "现场活动")
    @GetMapping("localActivity.do")
    public ResultVo findLocal(){ return activityService.findLocal(); }
}
