package com.qfedu.cgv.dao;

import com.qfedu.cgv.entity.MessageType;

import java.util.List;

public interface MessageTypeMapper {
    int deleteByPrimaryKey(Integer id);

    int insert(MessageType record);

    int insertSelective(MessageType record);

    MessageType selectByPrimaryKey(Integer id);

    int updateByPrimaryKeySelective(MessageType record);

    int updateByPrimaryKey(MessageType record);

    List<MessageType> findAll();
}