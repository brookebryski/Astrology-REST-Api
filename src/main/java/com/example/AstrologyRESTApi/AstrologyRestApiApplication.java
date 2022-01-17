package com.example.AstrologyRESTApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AstrologyRestApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(AstrologyRestApiApplication.class, args);
	}

}

// http://localhost:8080/astrology
// http://localhost:8080/astrology?sign=Leo