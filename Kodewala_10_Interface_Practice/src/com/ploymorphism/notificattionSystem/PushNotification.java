package com.ploymorphism.notificattionSystem;

public class PushNotification extends Notification{

	
	@Override
	public void send(String message)
	{
		System.out.println("Push notification sent: " +message);
	}
}
