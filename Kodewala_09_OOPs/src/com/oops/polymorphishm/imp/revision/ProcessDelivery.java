package com.oops.polymorphishm.imp.revision;

public class ProcessDelivery extends Delivery{
	
	public void process(Delivery delivery)
	{
		delivery.doDelivery();
		delivery.doPayment();
		delivery.cashPayment();
	}

}
