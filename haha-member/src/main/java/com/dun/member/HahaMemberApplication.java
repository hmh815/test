package com.dun.member;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class HahaMemberApplication {
	public static void main(String[] args) {
		SpringApplication.run(HahaMemberApplication.class, args);
	}
}
