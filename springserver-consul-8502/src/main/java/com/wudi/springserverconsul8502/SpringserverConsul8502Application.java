package com.wudi.springserverconsul8502;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringserverConsul8502Application {

	public static void main(String[] args) {
		SpringApplication.run(SpringserverConsul8502Application.class, args);
	}
}
