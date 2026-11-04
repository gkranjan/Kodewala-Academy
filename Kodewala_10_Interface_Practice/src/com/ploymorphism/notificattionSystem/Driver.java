package com.ploymorphism.notificattionSystem;

public class Driver {

	public static void main(String[] args) {

		Notification notification;
		
		notification = new EmailNotification();
		notification.send("Your order is confirmed");
		
		notification = new SMSNotification();
		notification.send("Your OTP is 1234");
		
		notification = new PushNotification();
		notification.send("New offer available");
	}

}
