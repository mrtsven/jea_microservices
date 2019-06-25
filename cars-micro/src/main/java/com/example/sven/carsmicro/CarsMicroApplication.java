package com.example.sven.carsmicro;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class CarsMicroApplication {

	public static void main(String[] args) {
		SpringApplication.run(CarsMicroApplication.class, args);
	}

}
