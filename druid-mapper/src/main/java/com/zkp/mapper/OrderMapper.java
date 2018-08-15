package com.zkp.mapper;

import com.zkp.pojo.Order;

public interface OrderMapper {
    int insert(Order record);

    int insertSelective(Order record);
}