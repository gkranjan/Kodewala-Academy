package com.interface2;

public class DeliveryProcessor {
	
	public void deliveryType(IDelivery delivery,double distance)
	{
		delivery.calculateDeliveryCharge(distance);
		delivery.deliver();
	}

}
