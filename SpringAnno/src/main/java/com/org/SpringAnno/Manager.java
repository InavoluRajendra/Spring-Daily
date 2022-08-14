package com.org.SpringAnno;

import org.springframework.stereotype.Component;

@Component
public class Manager implements Employee{

	@Override
	public void dowork() {
		// TODO Auto-generated method stub
		System.out.println("manage the branch office and other employees too");
		
	}

	@Override
	public void getsalary() {
		// TODO Auto-generated method stub
		System.out.println("office paid manager 90k");
		
	}
	

}
