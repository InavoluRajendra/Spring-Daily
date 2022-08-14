package com.org.mvc1;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {
	
	@RequestMapping("/")
	public String helloUser()
	{
		return "hai user";
	}
	
	@RequestMapping("/admin")
	public String admin()
	{
		return "Hello Admin";
	}

}
