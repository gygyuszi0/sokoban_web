package com.nye.sokoban_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.nye.SokobanEndpoints"})
public class SokobanWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SokobanWebApplication.class, args);
	}

}
