package com.song;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class MyDemoApplication {
	
	public static void main(String[] args) {
		SpringApplication.run(MyDemoApplication.class, args);
	}
	
}
