package com.canbaylan.departmenservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class DepartmenServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(DepartmenServiceApplication.class, args);
	}

}
