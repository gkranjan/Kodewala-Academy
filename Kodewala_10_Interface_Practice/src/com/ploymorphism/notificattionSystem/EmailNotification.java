package com.ploymorphism.notificattionSystem;

public class EmailNotification extends Notification {

	@Override
	public void send(String message)
	{
		System.out.println("Email sent: " +message);
	}
}
