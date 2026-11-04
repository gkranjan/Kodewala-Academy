package com.interfacePractice.polymorphism3;

public class Driver {

	public static void main(String[] args) {

		NotificationService service = new NotificationService();
		
		service.notifyUser(new EmailNotification(), "Order confirmed");
		
		service.notifyUser(new SMSNotification(), "Your OTP is 1234");
		
	
	}

}
