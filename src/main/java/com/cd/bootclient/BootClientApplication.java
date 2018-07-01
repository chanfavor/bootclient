package com.cd.bootclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class BootClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(BootClientApplication.class, args);
	}
}
