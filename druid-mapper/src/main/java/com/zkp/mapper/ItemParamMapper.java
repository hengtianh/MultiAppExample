package com.zkp.mapper;

import com.zkp.pojo.ItemParam;

public interface ItemParamMapper {
    int insert(ItemParam record);

    int insertSelective(ItemParam record);
}