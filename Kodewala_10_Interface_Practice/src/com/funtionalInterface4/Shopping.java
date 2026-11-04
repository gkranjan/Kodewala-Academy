package com.funtionalInterface4;

public class Shopping {
	public static void main(String[] args) {
		
		Discount discount = price -> price * 0.20;
		
		double result = discount.calculate(5000);
		
		System.out.println("Discount: " +result);
		System.out.println("Final Price: "+(5000 - result));
	}

}
