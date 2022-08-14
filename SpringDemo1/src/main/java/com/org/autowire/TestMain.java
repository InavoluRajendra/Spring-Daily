package com.org.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext c=new ClassPathXmlApplicationContext("Bean.xml");
		ClassA a=(ClassA) c.getBean("a");
		ClassB b=(ClassB) c.getBean("b");
		
		a.display();
		

	}

}
