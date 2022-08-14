package com.org.auto;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class AppMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfigApplicationContext con=new AnnotationConfigApplicationContext(Appconfig.class);
		Writer writer=con.getBean("fictionWriter",Writer.class);
		writer.write();
		writer.getAward();
		con.close();
	}

}
