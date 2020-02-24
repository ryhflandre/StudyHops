package com.study.controller;

import com.study.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import javax.annotation.Resource;

@Controller
public class StoreController {

    @Resource
    private ProductService productService;


    @PostMapping("/store/list")
    public String storelist(){
        return null;
    }
}
