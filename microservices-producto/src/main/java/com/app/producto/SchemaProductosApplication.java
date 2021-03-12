package com.app.producto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SchemaProductosApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchemaProductosApplication.class, args);
	}

}