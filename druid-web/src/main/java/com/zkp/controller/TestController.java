package com.zkp.controller;

import com.zkp.pojo.Item;
import com.zkp.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/api/item/")
public class TestController {

    @Autowired
    private TestService service;

    @RequestMapping(value = "{itemId}", method = RequestMethod.GET)
    @CrossOrigin(origins = "*", maxAge = 3600)
    @ResponseBody
    public Item getItemById(@PathVariable long itemId) {
        return service.selectItemById(itemId);
    }
}
