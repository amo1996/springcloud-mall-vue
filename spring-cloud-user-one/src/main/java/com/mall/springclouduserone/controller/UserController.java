package com.mall.springclouduserone.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {


    @GetMapping("/hello")
    public String hello(@RequestParam("name") String name){
        return "hello this is user one: "+name;
    }

}
