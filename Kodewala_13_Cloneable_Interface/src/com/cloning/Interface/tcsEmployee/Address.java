package com.cloning.Interface.tcsEmployee;

public class Address implements Cloneable{ // level - 2
	String line1;
	String line2;
	String city;
	public Address(String line1, String line2, String city) {
		super();
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}

}
