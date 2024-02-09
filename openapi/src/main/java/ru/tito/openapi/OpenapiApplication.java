package ru.tito.openapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = "{ru.tito.openapi}")
public class OpenapiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OpenapiApplication.class, args);
	}

}
