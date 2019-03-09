package com.qfedu.cgv.service.impl;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.dao.ActivityMapper;
import com.qfedu.cgv.entity.Activity;
import com.qfedu.cgv.service.ActivityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/9
 * Time: 19:57
 * Description: No Description
 */
@Service
public class ActivityServiceImpl implements ActivityService {
    @Autowired
    private ActivityMapper activityMapper;

    @Override
    public ResultVo findAll() {
        return ResultUtil.exec(true,"OK",activityMapper.findAll());
    }
}
