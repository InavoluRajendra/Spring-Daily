package com.org.setter_dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext a=new ClassPathXmlApplicationContext("Bean.xml");
		Employee empobj=(Employee) a.getBean("emp1");
		empobj.result();
	}

}
