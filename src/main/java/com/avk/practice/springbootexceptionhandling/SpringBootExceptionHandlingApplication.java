package com.avk.practice.springbootexceptionhandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.controller", "com.service" })
@EntityScan({ "com.models" })
public class SpringBootExceptionHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExceptionHandlingApplication.class, args);
	}

}
