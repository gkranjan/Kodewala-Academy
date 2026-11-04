package com.interfacePractice.polymorphism3;

public class NotificationService {
	
	public void notifyUser(Notification notification,String message)
	{
		notification.send(message);
	}
}
