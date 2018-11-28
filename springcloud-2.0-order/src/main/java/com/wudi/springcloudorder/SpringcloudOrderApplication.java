package com.wudi.springcloudorder;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class SpringcloudOrderApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringcloudOrderApplication.class, args);
	}

	//    注入容器
	@Bean
	@LoadBalanced   //手写ribbon负载均衡轮循机制需要关闭改注解
	//能让这个RestTemplate在请求时拥有客户端负载均衡的能力
	RestTemplate restTemplate() {
		return new RestTemplate();
	}
}
