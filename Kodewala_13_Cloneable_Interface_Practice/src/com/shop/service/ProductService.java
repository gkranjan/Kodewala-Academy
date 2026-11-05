package com.shop.service;

import com.shop.model.Product;

public class ProductService {

	public static void main(String[] args) {

		Product product=new Product(101,"I Phone",95000.50,"COD");
		
		try
		{
			Product clone1=(Product) product.clone();
			System.out.println("Before Cloning: ");
			product.display();
			
			System.out.println("\nAfter Cloning: ");
			clone1.display();
		}
		catch(CloneNotSupportedException e)
		{

			e.printStackTrace();
			
		}
	}

}
