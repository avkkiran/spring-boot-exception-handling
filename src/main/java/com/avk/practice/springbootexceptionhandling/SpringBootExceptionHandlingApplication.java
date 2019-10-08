package com.avk.practice.springbootexceptionhandling;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages= {"com.controller", "com.service", "com.exceptionhandling", "com.models"})
@SpringBootApplication(scanBasePackages= {"com.*"})
//@ComponentScan({ "com.controller", "com.service", "com.exceptionhandling" })
//@EntityScan({ "com.models" })
public class SpringBootExceptionHandlingApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootExceptionHandlingApplication.class, args);
	}

}
