package com.ngs;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootDemoWebappApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoWebappApplication.class, args);
		System.out.println("From Spring Boot app");
	}

}
