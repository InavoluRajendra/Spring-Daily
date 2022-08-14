package com.org.SpringAnno;

import org.springframework.stereotype.Component;

@Component
public class Hr implements Employee {

	@Override
	public void dowork() {
		// TODO Auto-generated method stub
		System.out.println("working as hr manager and manage hiring process");

	}

	@Override
	public void getsalary() {
		// TODO Auto-generated method stub
		System.out.println("hr is paid 60k");

	}

}
