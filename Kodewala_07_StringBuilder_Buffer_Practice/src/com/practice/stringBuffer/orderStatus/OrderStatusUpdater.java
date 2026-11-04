package com.practice.stringBuffer.orderStatus;

public class OrderStatusUpdater {

	public static void main(String[] args) {

		StringBuffer order = new StringBuffer("Order ID: ORD101 | Status: Pending");
		
		System.out.println("Before Update:");
		System.out.println(order);
		
		int start =order.indexOf("Pending");
		
		order.replace(start, start +7, "Shipped");
		
		System.out.println("\nAfter Update:");
		System.out.println(order);
	}

}
