package com.sun.zq.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(value = "com.sun.zq")
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootDemoApplication.class, args);
		SpringApplication app = new SpringApplication(SpringbootDemoApplication.class);
		//app.setBannerMode( Mode.OFF);
		app.run();
	}





}
