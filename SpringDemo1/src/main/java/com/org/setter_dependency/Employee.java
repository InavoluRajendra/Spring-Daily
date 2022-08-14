
package com.org.setter_dependency;

public class Employee {
	private int eid;
	String ename;
	String ecity;
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public String getEcity() {
		return ecity;
	}
	public void setEcity(String ecity) {
		this.ecity = ecity;
	}
	public void result()
	{
		System.out.println("emp results"+eid+" "+ename+" "+ecity);
	}
}

