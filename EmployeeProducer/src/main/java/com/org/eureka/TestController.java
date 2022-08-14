package com.org.eureka;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
	
	@RequestMapping(value="/employee",method=RequestMethod.GET)
	public Employee firstpage() {
		Employee emp=new Employee();
		emp.setName("raju");
		emp.setDesignation("manager");
		emp.setEmpid("101");
		emp.setSalary(20000);
		return emp;
	}

}
