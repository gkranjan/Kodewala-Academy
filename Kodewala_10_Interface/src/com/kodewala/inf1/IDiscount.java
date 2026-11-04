package com.kodewala.inf1;

// Java version 1.7 or 7 or Before
public interface IDiscount {
	
	
	// by default public static final is present here.
	public static final int MAX_VALUE=100; // public static final--> constant
	
	// public abstract int calculatrDiscount
	
	// without write public abstract are present here. by dafault
	public abstract int calculateDiscount(int amount,int rate);  // abstract --> idea or thought
	
	public abstract void calaculateDiscountTax(int Tax);

}
