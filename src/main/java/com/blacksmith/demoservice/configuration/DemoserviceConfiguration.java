package com.blacksmith.demoservice.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.blacksmith.demoservice.service.DemoserviceService;
import com.blacksmith.demoservice.service.DemoserviceServiceImpl;

@Configuration
public class DemoserviceConfiguration {

	@Bean
	public DemoserviceService newDemoservice() {
		return new DemoserviceServiceImpl();
	}
	
}
