package com.industryBased.E_CommerceInventory;

import java.util.Scanner;

public class ProductInventory {

	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		
		String[] products = {"Laptop","mobile","Keyboard","Mouse"};
		int[] stock = {10,20,15,30};
		
		System.out.println("========= PRODUCT INVENTORY ========");
		
		for(int i = 0; i< products.length;i++)
		{
			System.out.println(products[i]+" : " +stock[i]+" units");
		}
		
		System.out.println("\nEnter product name: ");
		String productName = sc.nextLine();
		
		System.out.println("Enter purchase quantity: ");
		int quantity = sc.nextInt();
		
		boolean found =false;
		
		for(int i=0;i< products.length;i++)
		{
			if(products[i].equalsIgnoreCase(productName))
			{
				found=true;
				
				if(quantity >0 && stock[i] >= quantity)
				{
					stock[i] =stock[i] - quantity;
					
					System.out.println("\nOrder successful!");
					System.out.println("Product: "+products[i]);
					System.out.println("Purchased: "+quantity);
					System.out.println("Remaining Stock: "+stock[i]);
				}
				else
				{
					System.out.println("Insuffient stock or invalid quantity!");
				}
				break;
			}
		}
		if(!found)
		{
			System.out.println("Product not found!");
		}
		sc.close();
		
		
	}

}
