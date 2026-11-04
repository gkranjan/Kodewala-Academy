package com.practice.builder.URLquery;

import java.util.Scanner;

public class URLBuilder {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		System.out.println("Enter Product name: ");
		String product = sc.nextLine();
		
		System.out.println("Enter Category: ");
		String category = sc.nextLine();
		
		System.out.println("Enter Page Number: ");
		int page = sc.nextInt();
		
		StringBuilder url = new StringBuilder();
		
		url.append("https://api.shop.com/products?");
		url.append("name=").append(product);
		url.append("&category=").append(category);
		url.append("&page=").append(page);
		
		System.out.println("\nGenerated URL:");
		System.out.println(url);
		sc.close();
	}

}
