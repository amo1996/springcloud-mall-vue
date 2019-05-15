package com.mall.springcloudorderone.controller;


import com.mall.springcloudorderone.entity.Test;
import com.mall.springcloudorderone.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @Autowired
    TestService testService;

    @GetMapping("/{id}")
    public Test findById(@PathVariable("id") Long id){
        return  testService.findById(id);
    }
}
