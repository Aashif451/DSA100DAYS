package com.DSA.designPattern.creational;

public class EmailNotificationFactory implements NotificationFactory{

	@Override
	public Notification createNotification() {
		 System.out.println("this is Email notification Factory");
		 EmailNotification emailNotification=new EmailNotification();
		 emailNotification.notifyMe();
		return emailNotification;
	}

}
