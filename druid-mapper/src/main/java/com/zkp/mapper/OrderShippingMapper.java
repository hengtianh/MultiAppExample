package com.zkp.mapper;

import com.zkp.pojo.OrderShipping;

public interface OrderShippingMapper {
    int insert(OrderShipping record);

    int insertSelective(OrderShipping record);
}