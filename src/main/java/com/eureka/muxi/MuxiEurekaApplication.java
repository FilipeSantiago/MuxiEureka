package com.eureka.muxi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class MuxiEurekaApplication {

	public static void main(String[] args) {
		SpringApplication.run(MuxiEurekaApplication.class, args);
	}
}
