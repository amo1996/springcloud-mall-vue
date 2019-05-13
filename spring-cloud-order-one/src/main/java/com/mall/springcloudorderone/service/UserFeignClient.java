package com.mall.springcloudorderone.service;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(name="provider-user",fallback = UserFeignClient.FeignClientFallback.class)
public interface UserFeignClient {

    /**
     * 注意只能用第二种方法，不然会提示我们没有指定HTTP方法
     * 而且@PathVariable 必须注定参数 不然会报
     * Caused by: java.lang.IllegalStateException: PathVariable annotation was empty on param 0.
     * 多参数的时候也需要指定@RequestParam("");
     * */
    // @GetMapping("/hello"
    @RequestMapping(value="/hello",method = RequestMethod.GET)
     String hello(@RequestParam("name") String name);

    /**
     * 回退类需实现feign Client 接口
     */
    @Component
    class FeignClientFallback implements  UserFeignClient{

        @Override
        public String hello(String name) {
            return "查不到了!";
        }
    }

}
