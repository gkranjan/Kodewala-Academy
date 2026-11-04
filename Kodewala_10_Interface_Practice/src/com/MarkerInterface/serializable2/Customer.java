package com.MarkerInterface.serializable2;

import java.io.Serializable;

public class Customer implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	int accountNumber;
	String customerNumber;
	double balance;
	
	public Customer(int accountNumber, String customerNumber, double balance) {
		super();
		this.accountNumber = accountNumber;
		this.customerNumber = customerNumber;
		this.balance = balance;
	}
}
