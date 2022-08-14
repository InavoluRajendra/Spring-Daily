package com.org.spel;

public class PaymentGateway {
	private String itemname;
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
	public void processOrder()
	{
		System.out.println("processing order="+order.getItem());
	}

}
