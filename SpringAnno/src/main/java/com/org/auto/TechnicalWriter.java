package com.org.auto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class TechnicalWriter implements Writer {

	private Award award;
	@Autowired
	@Qualifier("pultizerAward")
	

	public void setAward(Award award) {
		this.award = award;
	}

	@Override
	public void write() {
		// TODO Auto-generated method stub
		System.out.println("technical stuffs");

	}

	@Override
	public void getAward() {
		// TODO Auto-generated method stub
		award.award();

	}

}
