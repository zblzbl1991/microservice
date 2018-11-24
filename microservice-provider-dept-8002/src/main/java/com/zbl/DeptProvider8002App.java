package com.zbl;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class DeptProvider8002App {

	public static void main(String[] args) {
		SpringApplication.run(DeptProvider8002App.class,args);
	}
}
