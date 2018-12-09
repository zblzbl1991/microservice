package com.zbl.springcloud.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigRestController {

	@Value("${spring.application.name}")
	private String applicationName;
	@Value("${eureka.client.service-url.defaultZone}")
	private String defaultZone;
	@Value("${server.port}")
	private String port;


	@GetMapping("/config")
	public String getConfig(){
		String str="applicationName:"+applicationName+",defaultZone:"+defaultZone+",port:"+port;
		System.out.println(str);
		return str;
	}
}
