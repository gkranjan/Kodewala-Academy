package com.oops.polymorphishm.imp.revision;

public class Driver {
	
	
	public static void main(String[] args) {
		
		
		ProcessDelivery processDelivery=new ProcessDelivery();
		
		
		processDelivery.process(new FlipkartDelivery());
		
		
		/**
		 * its not achieved polymorphish, i just try to practice it ,how it is work.
		 */
		
//		FlipkartDelivery newDelivery=new FlipkartDelivery();
//		newDelivery.cashPayment();
		
		
	}

}
