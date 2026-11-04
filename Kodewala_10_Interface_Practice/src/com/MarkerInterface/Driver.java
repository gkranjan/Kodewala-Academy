package com.MarkerInterface;

public class Driver {

	public static void main(String[] args) {

		Customer customer = new Customer();
		
		if(customer instanceof PremiumCustomer)
		{
			System.out.println("Premium Customer");
		}
		else
		{
			System.out.println("Normal Customer");
		}
	}

}
