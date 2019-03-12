package com.qfedu.cgv.dao;

import com.qfedu.cgv.entity.LabelMovie;

public interface LabelMovieMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(LabelMovie record);

    int insertSelective(LabelMovie record);

    LabelMovie selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(LabelMovie record);

    int updateByPrimaryKey(LabelMovie record);
}