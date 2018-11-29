package com.klezovich.hello;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class HelloServiceApplication {

	@RequestMapping("/")
	public String getHello() {
		return "Hello world";
	}
	
	public static void main(String[] args) {
		SpringApplication.run(HelloServiceApplication.class, args);
	}
}
