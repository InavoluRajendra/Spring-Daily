package com.di_con;

import org.springframework.stereotype.Component;

public class Hr implements Employee {

	public Hr() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("hr cons");
	}

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
