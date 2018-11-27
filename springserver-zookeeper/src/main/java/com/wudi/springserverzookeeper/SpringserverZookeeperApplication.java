package com.wudi.springserverzookeeper;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringserverZookeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringserverZookeeperApplication.class, args);
	}
}
