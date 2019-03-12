package com.qfedu.cgv.dao;

import com.qfedu.cgv.entity.CardUser;

public interface CardUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(CardUser record);

    int insertSelective(CardUser record);

    CardUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(CardUser record);

    int updateByPrimaryKey(CardUser record);
}