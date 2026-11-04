package com.kodewala.constructors1;

public class OrderMgmt {

	public int orderValue = 1200;

	public void placeOrder(String itemName) {

		OrderMgmt objMgmt = new OrderMgmt();

		// using private variable with in the same class

		System.out.println(" Oder value is :" + objMgmt.orderValue);

		System.out.println("Placing an order for: " + itemName);
	}

}
