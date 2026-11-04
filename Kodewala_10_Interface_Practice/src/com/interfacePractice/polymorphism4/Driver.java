package com.interfacePractice.polymorphism4;

public class Driver {

	public static void main(String[] args) {

		Customer customer;
		
		customer = new RegularCustomer();
		System.out.println("Regular discount: Rs. " +customer.calculateDiscount(10000));
	
		customer = new PremiumCustomer();
		System.out.println("Premium discount: Rs. " +customer.calculateDiscount(10000));
	}

}
