package com.qfedu.cgv.dao;

import com.qfedu.cgv.entity.GoodsUser;

public interface GoodsUserMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(GoodsUser record);

    int insertSelective(GoodsUser record);

    GoodsUser selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(GoodsUser record);

    int updateByPrimaryKey(GoodsUser record);
}