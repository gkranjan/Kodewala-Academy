package com.kodewala.constructors4;

public class NotificcationService1 {

	public static void main(String[] args) {
		NotificcationService obj = new NotificcationService();

		obj.sendNotification("sms");
		obj.sendNotification("email");
		obj.sendNotification("sendWhatsApp");
	}

}
