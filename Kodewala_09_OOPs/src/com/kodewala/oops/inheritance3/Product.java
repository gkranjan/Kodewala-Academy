package com.kodewala.oops.inheritance3;

public class Product {
	
	String productName;
	String describtion;
	int quantity;
	String status;
	
	public Product(String productName, String describtion, int quantity, String status) {
		super();
		this.productName = productName;
		this.describtion = describtion;
		this.quantity = quantity;
		this.status = status;
	}
	
	
	public void viewProductDetails()
	{
		
		System.out.println(productName);
		System.out.println(describtion);
		System.out.println( quantity);
		System.out.println(status);
	}

}
