package com.example.springtest.hichChartTest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@SpringBootApplication
public class HichChartTestApplication implements WebMvcConfigurer {

	public void addViewController(ViewControllerRegistry registry){
		registry.addViewController("/login").setViewName("login");
	}

	public static void main(String[] args) {
		SpringApplication.run(HichChartTestApplication.class, args);
	}

}
