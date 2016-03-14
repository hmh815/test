package com.dun.eureka;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class HahaEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(HahaEurekaApplication.class, args);
	}
}
