package com.qfedu.cgv.dao;

import com.qfedu.cgv.entity.MoveMoveDetail;

public interface MoveMoveDetailMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MoveMoveDetail record);

    int insertSelective(MoveMoveDetail record);

    MoveMoveDetail selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MoveMoveDetail record);

    int updateByPrimaryKey(MoveMoveDetail record);
}