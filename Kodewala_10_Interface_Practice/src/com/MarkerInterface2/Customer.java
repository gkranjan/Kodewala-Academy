package com.MarkerInterface2;

public class Customer implements VIPCustomer {

	int customerId;
	String customerName;
	public Customer(int customerId, String customerName) {
		super();
		this.customerId = customerId;
		this.customerName = customerName;
	}
	
	
}
