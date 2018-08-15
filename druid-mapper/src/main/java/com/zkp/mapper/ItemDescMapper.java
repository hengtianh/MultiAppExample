package com.zkp.mapper;

import com.zkp.pojo.ItemDesc;

public interface ItemDescMapper {
    int insert(ItemDesc record);

    int insertSelective(ItemDesc record);
}