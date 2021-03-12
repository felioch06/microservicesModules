package com.app.categoria;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class SchemaCategoriasApplication {

	public static void main(String[] args) {
		SpringApplication.run(SchemaCategoriasApplication.class, args);
	}

}
