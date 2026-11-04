package com.interfacePct.lambda9;

import java.util.UUID;
import java.util.function.Supplier;

public class OrderIdGenerator {

	public static void main(String[] args) {

		Supplier<String> orderId = () -> 
		{
			return "ORD-" + UUID.randomUUID();
		};
		
		String id = orderId.get();
		System.out.println("Your Order ID: " +id);
	}

}
