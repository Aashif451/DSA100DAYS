package com.DSA.designPattern.creational.factory;

public class SmsNotificationFactory implements NotificationFactory {

	@Override
	public Notification createNotification() {
		
		SMSnotifications smSnotifications=new SMSnotifications();
		smSnotifications.notifyMe();
		System.out.println("create notification for SMS Notification Service");
		return smSnotifications;
	}

}
