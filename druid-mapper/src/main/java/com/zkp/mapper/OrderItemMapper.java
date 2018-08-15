package com.zkp.mapper;

import com.zkp.pojo.OrderItem;

public interface OrderItemMapper {
    int insert(OrderItem record);

    int insertSelective(OrderItem record);
}