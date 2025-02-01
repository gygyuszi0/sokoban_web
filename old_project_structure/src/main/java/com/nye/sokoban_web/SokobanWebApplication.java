package com.nye.sokoban_web;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.nye.SokobanEndpoints"})
@ComponentScan(basePackages = {"com.nye.SokobanApp"})
@ComponentScan(basePackages = {"com.nye.SokobanApp.AppInterface"})
@ComponentScan(basePackages = {"com.nye.SokobanApp.AppImpl"})
public class SokobanWebApplication {

	public static void main(String[] args) {
		SpringApplication.run(SokobanWebApplication.class, args);
	}

}
