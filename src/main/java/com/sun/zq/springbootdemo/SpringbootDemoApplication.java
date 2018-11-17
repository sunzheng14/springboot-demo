package com.sun.zq.springbootdemo;

import de.codecentric.boot.admin.server.config.EnableAdminServer;
import org.springframework.amqp.core.Queue;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
//@EnableAdminServer
//@EnableAutoConfiguration
public class SpringbootDemoApplication {

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootDemoApplication.class, args);
		SpringApplication app = new SpringApplication(SpringbootDemoApplication.class);
		//app.setBannerMode( Mode.OFF);
		app.run();
	}

	@Bean
	public Queue setQueue(){
		return new Queue("my-queue");
	}





}
