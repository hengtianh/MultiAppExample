package com.zkp.mapper;

import com.zkp.pojo.Item;


public interface ItemMapper {

    int insert(Item record);

    int insertSelective(Item record);

    Item selectById(long id);
}