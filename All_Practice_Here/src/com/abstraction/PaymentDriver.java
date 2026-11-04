package com.abstraction;

public class PaymentDriver {

	public static void main(String[] args) {

		Payment p;

		p = new UPI();
		p.pay(500);

		p = new Card();
		p.pay(1000);
	}

}
