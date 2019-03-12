package com.qfedu.cgv.dao;

import com.qfedu.cgv.entity.UserCoupons;

public interface UserCouponsMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(UserCoupons record);

    int insertSelective(UserCoupons record);

    UserCoupons selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(UserCoupons record);

    int updateByPrimaryKey(UserCoupons record);

}