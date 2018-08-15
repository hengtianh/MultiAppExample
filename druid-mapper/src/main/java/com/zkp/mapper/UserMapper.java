package com.zkp.mapper;

import com.zkp.pojo.User;

public interface UserMapper {
    int insert(User record);

    int insertSelective(User record);
}