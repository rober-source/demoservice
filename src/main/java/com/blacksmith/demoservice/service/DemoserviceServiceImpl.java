package com.blacksmith.demoservice.service;

public class DemoserviceServiceImpl implements DemoserviceService {

	@Override
	public String status(String demo) {
		return "OK - " + demo;
	}

}
