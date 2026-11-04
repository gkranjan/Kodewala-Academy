package com.kodewala.constructors4;

public class NotificcationService {

	public void sendNotification(String _type) {
		System.out.println("NotificationService.sendnotifiaction()");

		if (_type.equalsIgnoreCase("sms")) {
			sendSMS();
		} else if (_type.equalsIgnoreCase("email")) {
			sendEmail();
		}

		else {
			sendWhatsApp();
		}
	}

	private void sendSMS() {
		System.out.println("NotificationsendSMS().sendSMS() Start");
		// biz logic
		System.out.println("NotificationsendSMS().sendSMS() End");
	}

	private void sendEmail() {

		System.out.println("NotificationsendSMS().sendEmail() Start");

		System.out.println("NotificationsendSMS().sendEmail() End");
	}

	private void sendWhatsApp() {

		System.out.println("NotificationsendSMS().sendWhatsApp() Start");

		System.out.println("NotificationsendSMS().sendWhatsApp() End");
	}
}
