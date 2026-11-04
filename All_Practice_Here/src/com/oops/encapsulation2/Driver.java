package com.oops.encapsulation2;

public class Driver {
	public static void main(String[] args) {

		ATM pinCheck = new ATM("123", 500);
		pinCheck.getBalance();
		pinCheck.getCredit(200);
		pinCheck.withdraw(50);
		pinCheck.displayUserDetail("Gautam", "5468798");

	}
}
