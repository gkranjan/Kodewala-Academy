package com.ploymorphism.notificattionSystem;

public class SMSNotification extends Notification{
	
	public void send(String message)
	{
		System.out.println("SMS sent: " +message);
	}

}
