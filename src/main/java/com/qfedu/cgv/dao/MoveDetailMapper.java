package com.qfedu.cgv.dao;

import com.qfedu.cgv.entity.MoveDetail;
import org.apache.ibatis.annotations.Param;

import java.util.Date;
import java.util.List;

public interface MoveDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MoveDetail record);

    int insertSelective(MoveDetail record);

    MoveDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MoveDetail record);

    int updateByPrimaryKey(MoveDetail record);

    List<MoveDetail> selectByIdAndDayTime(@Param(value="mid") Integer mid, @Param(value = "daytime") String daytime);
}