package com.blacksmith.demoservice.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.blacksmith.demoservice.service.DemoserviceService;

@RestController
public class DemoserviceAPI {
	
	@Autowired
	private DemoserviceService service;
	
	
	@RequestMapping("/status/{demo}")
	public @ResponseBody String status(@PathVariable("demo") String demo) {
		return service.status(demo);
	}

}
