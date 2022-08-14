package com.org.handson;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

public class Impl implements MessageProcesor {
	private MessageService m;
	@Autowired
	@Qualifier("Email")
	public void setM(MessageService m) {
		this.m = m;
	}
	@Override
	public void processmsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println("processed message"+msg);
		m.sendmsg(msg);

	}
	@Autowired
	public Impl(@Qualifier("Email")MessageService m) {
		super();
		this.m = m;
	}
	
	
}
