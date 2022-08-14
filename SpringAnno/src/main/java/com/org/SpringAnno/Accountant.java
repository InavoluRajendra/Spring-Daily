package com.org.SpringAnno;

import org.springframework.stereotype.Component;

@Component
public class Accountant implements Employee{

	@Override
	public void dowork() {
		// TODO Auto-generated method stub
		System.out.println("accountant is hired to manage all expenses");
		
	}

	@Override
	public void getsalary() {
		// TODO Auto-generated method stub
		System.out.println("acccountant is paid 70k");
		
	}

}
