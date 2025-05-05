package com.humanresources.oath;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@EnableDiscoveryClient
@SpringBootApplication
public class HrOathApplication {

	public static void main(String[] args) {
		SpringApplication.run(HrOathApplication.class, args);
	}

}
