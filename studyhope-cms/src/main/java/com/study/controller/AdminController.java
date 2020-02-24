package com.study.controller;


import com.study.dojo.Admins;
import com.study.dojo.Product;
import com.study.service.ProductService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class AdminController {

    @Resource
    private ProductService productService;

    @PostMapping("/admin/list")
    public String adminlist(Model model,Integer page,Integer size){
        List<Product> products = productService.list();

        return "list";
    }

    @PostMapping("/upload")
    public String upload(@RequestParam MultipartFile file){
        return null;
    }

    @PostMapping("/admin/del")
    @ResponseBody
    public boolean admindel(Integer id){

        return false;
    }

    @PostMapping("/admin/update")
    @ResponseBody
    public boolean adminupdate(Admins admins){

        return false;
    }

    @PostMapping("/admin/login")
    @ResponseBody
    public boolean adminlogin(String username,String password){
        return false;
    }


    @PostMapping("/admin/register")
    @ResponseBody
    public boolean adminregister(){

        return false;
    }

}
