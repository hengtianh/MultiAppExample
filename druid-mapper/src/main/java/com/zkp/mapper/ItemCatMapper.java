package com.zkp.mapper;

import com.zkp.pojo.ItemCat;

public interface ItemCatMapper {
    int insert(ItemCat record);

    int insertSelective(ItemCat record);
}