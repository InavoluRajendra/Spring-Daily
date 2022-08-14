package com.org.spel;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringDemo {
	public static void main(String args[])
	{
		String conffile="Bean.xml";
		ConfigurableApplicationContext context=new ClassPathXmlApplicationContext(conffile);
		PaymentGateway gateway=(PaymentGateway) context.getBean("paymentGateway");
		gateway.processOrder();
		
		
		
	
	}

}
