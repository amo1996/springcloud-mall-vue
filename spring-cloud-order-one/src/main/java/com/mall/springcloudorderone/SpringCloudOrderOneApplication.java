package com.mall.springcloudorderone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableDiscoveryClient
@EnableFeignClients
public class SpringCloudOrderOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudOrderOneApplication.class, args);
	}

}
