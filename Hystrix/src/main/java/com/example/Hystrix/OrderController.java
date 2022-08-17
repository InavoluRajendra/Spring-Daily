package com.example.Hystrix;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
@RequestMapping("/order")
public class OrderController {

	@Autowired
	private RestTemplate resttemplate;

	@GetMapping
	@HystrixCommand(fallbackMethod = "defaultFunction", commandProperties = {
			@HystrixProperty(name = "execution.isolation.thread.timeoutinMilliseconds", value = "10000"),
			@HystrixProperty(name = "circuitBreaker.errorThresholdPercentages", value = "50"),
			@HystrixProperty(name = "circuitrBreaker.requestVolumeThershold", value = "10") })
	public String getOrderStatus() {
		ResponseEntity<String> responseEntity = resttemplate.getForEntity("http://localhost:8081/payment",String.class);
		System.out.println(responseEntity.getBody());
		return responseEntity.getBody();
	}

	public String defaultFunction() {
		return "Server is down, please try later!!";
	}

}
