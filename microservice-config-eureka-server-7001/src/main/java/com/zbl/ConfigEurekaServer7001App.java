package com.zbl;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ConfigEurekaServer7001App {
	public static void main(String[] args) {
		SpringApplication.run(ConfigEurekaServer7001App.class,args);
	}
}
