package com.org.DemoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LimitConfigurationController {
	
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limit1")
	public LimitConfiguration retriveLimit() {
		return new LimitConfiguration(configuration.getMaximum(), configuration.getMinimum());
	}
	@GetMapping("/limit")
	public LimitConfiguration retriveLimitsFromConfigurations() {
		return new LimitConfiguration(1000, 1);

	}
}
