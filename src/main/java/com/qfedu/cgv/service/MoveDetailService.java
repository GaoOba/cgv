package com.qfedu.cgv.service;

import com.qfedu.cgv.comment.vo.ResultVo;

import java.util.List;

/**
 * @author Lei
 * @ddate 2019/3/13 0013 下午 17:50
 */
public interface MoveDetailService {
    public ResultVo selectByIdAndDayTime(Integer mid, String daytime);
}
