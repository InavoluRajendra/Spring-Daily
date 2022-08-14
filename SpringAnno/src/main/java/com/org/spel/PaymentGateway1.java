package com.org.spel;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("paymentGateway")
public class PaymentGateway1 {
	
	@Value("#{beanOrder.item}")
	private String itemname;
	
	@Value("#{beanOrder}")
	private Order order;

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
