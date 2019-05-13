package com.mall.springclouduserone;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringCloudUserOneApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCloudUserOneApplication.class, args);
	}

}
