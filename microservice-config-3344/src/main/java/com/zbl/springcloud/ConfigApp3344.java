package com.zbl.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigApp3344 {
	public static void main(String[] args) {
		SpringApplication.run(ConfigApp3344.class,args);
	}
}
