package com.oops.polymorphishm.imp.revision;

public class Ekart extends Delivery{
	@Override
	public void doDelivery()
	{
		System.out.println("Ekart.doDelivery().....Ekart");
		
	}
	
	@Override
	public void doPayment()
	{
		System.out.println("Delivery.doPayment()...DeliveryPayment");
	}

}
