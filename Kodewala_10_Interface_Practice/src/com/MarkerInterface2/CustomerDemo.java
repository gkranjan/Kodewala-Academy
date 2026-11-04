package com.MarkerInterface2;

public class CustomerDemo {

	public static void main(String[] args) {

		Customer c= new Customer(101,"Rahul");
		
		if(c instanceof VIPCustomer)
		{
			System.out.println("VIP Customer");
			System.out.println("Special Discount Applied");
		}
		else
		{
			System.out.println("Normal Customer");
		}
	}

}
