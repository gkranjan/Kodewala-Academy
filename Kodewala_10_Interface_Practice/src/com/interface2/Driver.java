package com.interface2;

public class Driver {

	public static void main(String[] args) {

		DeliveryProcessor process = new DeliveryProcessor();
		process.deliveryType(new SameDayDelivery(), 10);
		
	}

}
