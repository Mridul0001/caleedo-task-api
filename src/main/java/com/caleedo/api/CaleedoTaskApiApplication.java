package com.caleedo.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class CaleedoTaskApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(CaleedoTaskApiApplication.class, args);
	}

	//Adding CORS handling method, at present it accepts all origins for GET,POST,PUT,DELETE
	@Bean
	public WebMvcConfigurer corsConfigurer() {
		return new WebMvcConfigurer() {
			@Override
			public void addCorsMappings(CorsRegistry registry) {
				registry.addMapping("/**").allowedMethods("GET", "POST", "PUT", "DELETE").allowedOrigins("https://caleedo-task.herokuapp.com","http://localhost:4200");
			}
		};
	}

}
