package com.interfacePct.consumer.lambda7;

import java.util.function.Consumer;

public class CustomerNotification {

	public static void main(String[] args) {

		Consumer<String> notification = message->
		{
			System.out.println("notification Sent: " +message);
		};
		
		notification.accept("Your payment is successful");
		notification.accept("Your order has been shipped");
	}

}
