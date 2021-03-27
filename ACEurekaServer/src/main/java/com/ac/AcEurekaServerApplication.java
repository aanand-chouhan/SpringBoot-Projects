package com.ac;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class AcEurekaServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AcEurekaServerApplication.class, args);
	}

}
