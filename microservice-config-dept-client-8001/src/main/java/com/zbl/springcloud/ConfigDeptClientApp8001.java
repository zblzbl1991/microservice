package com.zbl.springcloud;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigDeptClientApp8001 {

	public static void main(String[] args) {
		SpringApplication.run(ConfigDeptClientApp8001.class,args);
	}
}
