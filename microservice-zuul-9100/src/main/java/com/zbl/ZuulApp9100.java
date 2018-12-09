package com.zbl;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy
public class ZuulApp9100 {
	public static void main(String[] args) {
		SpringApplication.run(ZuulApp9100.class,args);
	}
}
