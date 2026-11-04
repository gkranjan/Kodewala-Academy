package com.practice.builder.descrriptionFormatter;

public class ProductDescription {

	public static void main(String[] args) {

		StringBuilder describtion = new StringBuilder();
		describtion.append("Product: Laptop | ");
		describtion.append("Brand: Dell | ");
		describtion.append("Price: 55000 | ");
		describtion.append("Stock: Available | ");
		
		System.out.println("Original Description: ");
		System.out.println(describtion);
		
		describtion.deleteCharAt(describtion.length()-1);
		
		System.out.println("\nFinal Description: ");
		System.out.println(describtion);
		
		System.out.println("\nTotal Length: "+describtion.length());
	}

}
