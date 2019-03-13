package com.qfedu.cgv.service.impl;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.dao.MovieIntroMapper;
import com.qfedu.cgv.service.MovieIntroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created with IntelliJ IDEA.
 * User: 冯志立
 * Date: 2019/3/13
 * Time: 18:20
 * Description: No Description
 */
@Service
public class MovieIntroServiceImpl implements MovieIntroService {
    @Autowired
    private MovieIntroMapper introMapper;

    @Override
    public ResultVo findByMid(int mid) {
        return ResultUtil.exec(true,"OK",introMapper.findByMid(mid));
    }
}
