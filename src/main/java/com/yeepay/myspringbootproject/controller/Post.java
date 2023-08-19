package com.yeepay.myspringbootproject.controller;

import com.yeepay.myspringbootproject.pojo.User;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Post {
    @RequestMapping("hello")
    public String Hello(String name, int age) {
        System.out.println(name + age);
        return "OK";
    }
    @RequestMapping("pojo")
    public String Pojo(User user){
        System.out.println(user);
        return "OK";
    }
}
