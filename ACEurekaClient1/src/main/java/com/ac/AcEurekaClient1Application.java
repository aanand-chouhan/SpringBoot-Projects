package com.ac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class AcEurekaClient1Application {

	public static void main(String[] args) {
		SpringApplication.run(AcEurekaClient1Application.class, args);
	}

}
