package com.di_con;

import org.springframework.stereotype.Component;


public class Accountant implements Employee{

	public Accountant() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("account cons");
	}

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
