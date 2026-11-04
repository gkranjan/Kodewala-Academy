package com.kodewala.constructors5;

class SuperClass extends Object {

}

public class User {

	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;

	User(int _amount, String _ItemName, String _billingAddress, String _customerId, String _customerName) {

		this(300); // calling same class(user) constructor.

		this.amount = _amount;
		this.itemName = _ItemName;
		this.billingAddress = _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;

	}

	User(int amount) {

		this();
		System.out.println("user()...no arg" + amount);

	}

	User() {
		this(" Kumar");
		System.out.println("Hello Gautam ");
	}

	User(String name) {
		//this("Deoghar");
		
		System.out.println("Ranjan" + name);
	}
	
//	User(String _address2)
//	{
//	System.out.println("Address:" +_address2 );	
//	}

}
