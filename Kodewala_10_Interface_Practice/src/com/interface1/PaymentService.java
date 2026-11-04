package com.interface1;

public class PaymentService {
	
	public void processPayment(IPayment payment1,double amount)
	{
		
		payment1.pay(amount);
	}

}
