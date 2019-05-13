package com.mall.springcloudorderone.controller;


import com.mall.springcloudorderone.service.UserFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private UserFeignClient userFeignClient;

    @GetMapping("/hello")
  public String getUserHello(@RequestParam("name") String name){
      return this.userFeignClient.hello(name);
  }

}
