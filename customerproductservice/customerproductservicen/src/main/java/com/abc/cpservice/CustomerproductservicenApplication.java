package com.abc.cpservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@EnableHystrix
@EnableHystrixDashboard
@EnableEurekaClient
@SpringBootApplication
public class CustomerproductservicenApplication {

	public static void main(String[] args) {
		SpringApplication.run(CustomerproductservicenApplication.class, args);
	}
	
	@Bean
	public RestTemplate getRestTemplate() {
		
		return new RestTemplate();
	}

}
