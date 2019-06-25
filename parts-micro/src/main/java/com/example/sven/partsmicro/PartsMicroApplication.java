package com.example.sven.partsmicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class PartsMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(PartsMicroApplication.class, args);
	}

}
