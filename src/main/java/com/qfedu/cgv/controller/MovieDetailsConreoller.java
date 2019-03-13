package com.qfedu.cgv.controller;

import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.service.MoveDetailService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Lei
 * @ddate 2019/3/13 0013 下午 19:53
 */

@RequestMapping("/MovieDetail")
@RestController
@CrossOrigin
@Api
public class MovieDetailsConreoller {

    @Autowired
    private MoveDetailService mdService;

    @ApiOperation(value = "查找电影的场次")
    @PostMapping("find.do")
    public ResultVo selectByIdAndTime(@ApiParam(name = "mid", value = "电影ID") Integer mid, @ApiParam(name="daytime",value = "当天时间 格式：yyyy-MM-dd") String daytime) {

        ResultVo vo = mdService.selectByIdAndDayTime(mid, daytime);

        return vo;

    }

}
