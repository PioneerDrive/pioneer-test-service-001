package com.pioneer.service.test1.pioneertestserver001;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class PioneerTestServer001Application {

	public static void main(String[] args) {
		SpringApplication.run(PioneerTestServer001Application.class, args);
	}

}

