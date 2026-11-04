package com.interface2;

public class SameDayDelivery  implements IDelivery{

	@Override
	public void calculateDeliveryCharge(double distance) {
		
		System.out.println("Disatnce wala" +distance);
	}

	@Override
	public void deliver() {
		
		System.out.println("Deliver wala");
	}

}
