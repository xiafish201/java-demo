package com.bip.lxm.demo;

import java.time.LocalDateTime;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController; 
import org.springframework.web.bind.annotation.GetMapping; 


@SpringBootApplication
@RestController
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

	@GetMapping("hello")
	public String hello() {
		return "hello springboot " + LocalDateTime.now();
	}

}
