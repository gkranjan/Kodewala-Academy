package com.wholeInterface.ECommerceOrderManagementSystem;

public interface IOrder {
	void placeOrder();
	default void showOrderStatus()
	{
		System.out.println("Order Status: Processing");
	}
	static boolean validateOrder(double amount)
	{
		return amount>0;
	}

}
