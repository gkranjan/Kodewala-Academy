package com.kodewala.constructors5;

public class Driver {

	public static void main(String[] args) {

		// static int gst = 18; //Change it

		User inv = new User(18000, "Iphone", "Kodewala BTM", "C455", "Gautam");
		System.out.println("First invoice:=" + inv.amount + "," + inv.customerId);

		// User inv1 = new User(1000, "Iphone pro", "Kodewala BTM", "C455", "Gautam Ranjan");
		// System.out.println("Second invoice:=" + inv1.amount + "," + inv1.customerId);
		
	}
}
