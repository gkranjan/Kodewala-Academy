package com.kodewala.constructors4;

public class Driver {
	
public static void main(String[] args) {

		
		// static int gst = 18;  //Change it
		
		Invoice inv = new Invoice(18000, "Iphone", "Kodewala BTM", "C455", "Gautam");

		Invoice inv1 = new Invoice(1000, "Iphone pro", "Kodewala BTM", "C455", "Gautam Ranjan");

		System.out.println("First invoice:=" + inv.amount + "," + inv.customerId + "," + inv.gst);

		System.out.println("Second invoice:=" + inv1.amount + "," + inv1.customerId + "," + inv1.gst);

	}

}
