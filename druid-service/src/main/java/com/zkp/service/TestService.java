package com.zkp.service;

import com.zkp.mapper.ItemMapper;
import com.zkp.pojo.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @Autowired
    private ItemMapper itemMapper;

    public Item selectItemById(long id) {
        return itemMapper.selectById(id);
    }
}
