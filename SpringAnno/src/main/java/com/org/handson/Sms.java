package com.org.handson;

import org.springframework.stereotype.Component;

@Component
public class Sms implements MessageService {

	@Override
	public void sendmsg(String msg) {
		// TODO Auto-generated method stub
		System.out.println("msg via sms"+msg);
	}

}
