package com.qfedu.cgv.service.impl;

import com.qfedu.cgv.comment.utils.ResultUtil;
import com.qfedu.cgv.comment.vo.ResultVo;
import com.qfedu.cgv.dao.MoveDetailMapper;
import com.qfedu.cgv.entity.MoveDetail;
import com.qfedu.cgv.service.MoveDetailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Lei
 * @ddate 2019/3/13 0013 下午 17:55
 */

@Service
public class MovieDetailServiceImpl implements MoveDetailService {
    @Autowired
    private MoveDetailMapper mdDao;

    @Override
    public ResultVo selectByIdAndDayTime(Integer mid, String daytime) {

        List<MoveDetail> list = mdDao.selectByIdAndDayTime(mid, daytime);

        return ResultUtil.exec(true,"OK",list);
    }
}
