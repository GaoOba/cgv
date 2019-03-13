package com.qfedu.cgv.dao;

import com.qfedu.cgv.entity.Movie;
import com.qfedu.cgv.entity.UserMovie;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface UserMovieMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserMovie record);

    int insertSelective(UserMovie record);

    UserMovie selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserMovie record);

    int updateByPrimaryKey(UserMovie record);

    List<Movie> findById(int uid);

    int deleteById(@Param("uid") int uid, @Param("mid") int mid);

    int countMovie(@Param("uid") int uid, @Param("mid") int mid);
}