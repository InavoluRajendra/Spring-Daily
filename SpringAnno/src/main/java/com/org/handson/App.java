package com.org.handson;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.org.auto.Appconfig;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
AnnotationConfigApplicationContext c=new AnnotationConfigApplicationContext(com.org.handson.Appconfig.class);
MessageProcesor m=c.getBean(MessageProcesor.class);
m.processmsg("hai hello");
c.close();
	}

}
