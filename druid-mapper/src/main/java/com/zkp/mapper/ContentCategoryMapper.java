package com.zkp.mapper;

import com.zkp.pojo.ContentCategory;

public interface ContentCategoryMapper {
    int insert(ContentCategory record);

    int insertSelective(ContentCategory record);
}