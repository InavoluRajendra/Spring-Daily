package com.di_con;

import org.springframework.stereotype.Component;


public class Manager implements Employee{
	/*int id;
	String name;

	public Manager(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}*/
	Accountant account;
	Hr h;
	

	public Manager(Accountant account, Hr h) {
		super();
		this.account = account;
		this.h = h;
	}
	@Override
	public void dowork() {
		// TODO Auto-generated method stub
		System.out.println("manage the branch office and other employees too");
		
	}
	public void callmeet()
	{
		account.dowork();
		h.dowork();
		
		
	}

	@Override
	public void getsalary() {
		// TODO Auto-generated method stub
		System.out.println("office paid manager 90k");
		
	}
	

}
