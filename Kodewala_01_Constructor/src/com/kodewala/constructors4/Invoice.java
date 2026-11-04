package com.kodewala.constructors4;

public class Invoice extends Object {

	static int gst = 18;

	int amount;
	String itemName;
	String billingAddress;
	String customerId;
	String customerName;

	Invoice(int _amount, String _ItemName, String _billingAddress, String _customerId, String _customerName) {
		this.amount = _amount;
		this.itemName = _ItemName;
		this.billingAddress = _billingAddress;
		this.customerId = _customerId;
		this.customerName = _customerName;

	}
}


