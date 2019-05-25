package com.example.sb_eureka_java11;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SbEurekaJava11Application {

	public static void main(String[] args) {
		SpringApplication.run(SbEurekaJava11Application.class, args);
	}

}
