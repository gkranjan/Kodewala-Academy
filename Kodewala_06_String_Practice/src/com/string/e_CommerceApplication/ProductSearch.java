package com.string.e_CommerceApplication;

import java.util.Scanner;

public class ProductSearch {

	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		
		String [] products= {
				
				"Laptop",
				"Mobile",
				"Keyword",
				"Mouse",
				"Headphone"
		};
		System.out.println("Enter Product name: ");
		String search =sc.nextLine();
		
		boolean found =false;
		
		for(String product : products)
		{
			if(product.equalsIgnoreCase(search))
			{
				System.out.println("Product Available: "+product);
				found = true;
				break;
			}
		}
		if(!found)
		{
			System.out.println("Product Not Available");
		}
		sc.close();
		
		
	}

}
