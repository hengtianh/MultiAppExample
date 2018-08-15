package com.zkp.mapper;

import com.zkp.pojo.ItemParamItem;

public interface ItemParamItemMapper {
    int insert(ItemParamItem record);

    int insertSelective(ItemParamItem record);
}