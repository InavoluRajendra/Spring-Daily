package com.org.autowire;

public class ClassA {
	ClassB b;

	public ClassA() {
		super();
		// TODO Auto-generated constructor stub
		System.out.println("class A cons");
	}
	public ClassB getb()
	{
		return b;
	}
	void print()
	{
		System.out.println("Hello from classA");
	}
	public void display()
	{
		print();
		b.print();
	}
	public void setB(ClassB b) {
		this.b = b;
	}
	

}
