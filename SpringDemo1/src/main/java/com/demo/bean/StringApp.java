package com.demo.bean;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StringApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("Bean.xml");
		Employee e=(Employee) con.getBean("emp");
		System.out.println("eid="+e.getId());
		System.out.println("ename="+e.getName());
		System.out.println("esal="+e.getSalary());

	}

}
