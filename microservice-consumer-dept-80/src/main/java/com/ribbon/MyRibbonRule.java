package com.ribbon;


import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyRibbonRule {

	@Bean
	public IRule getMyRibbonRule(){
		return new RandomRule();
	}
}
