package com.shop.model;

public class Product implements Cloneable {
	
	private int productId;
	private String productName;
	private double price;
	private String category;
	
	public Product(int productId, String productName, double price, String category) {
		super();
		this.productId = productId;
		this.productName = productName;
		this.price = price;
		this.category = category;
	}
	
	public Object clone() throws CloneNotSupportedException
	{
		return super.clone();
	}
	public void display()
	{
		System.out.println("Product ID: "+productId);
		System.out.println("Product Name: "+productName);
		System.out.println("Price: "+price);
		System.out.println("Category: "+category);
	}

}
