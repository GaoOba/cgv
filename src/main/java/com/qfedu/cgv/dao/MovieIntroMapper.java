package com.qfedu.cgv.dao;

import com.qfedu.cgv.entity.MovieIntro;

import java.util.List;

public interface MovieIntroMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MovieIntro record);

    int insertSelective(MovieIntro record);

    MovieIntro selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MovieIntro record);

    int updateByPrimaryKey(MovieIntro record);

    List<MovieIntro> findByMid(int mid);
}