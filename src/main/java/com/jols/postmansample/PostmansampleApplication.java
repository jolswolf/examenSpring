package com.jols.postmansample;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan(basePackages = "com.jols.postmansample.*")
@SpringBootApplication
public class PostmansampleApplication {

	public static void main(String[] args) {
		SpringApplication.run(PostmansampleApplication.class, args);
	}

}
