package com.zkp.mapper;

import com.zkp.pojo.Content;

public interface ContentMapper {
    int insert(Content record);

    int insertSelective(Content record);
}