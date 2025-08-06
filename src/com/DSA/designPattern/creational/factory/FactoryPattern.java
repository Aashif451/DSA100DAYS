package com.DSA.designPattern.creational.factory;

public class FactoryPattern {
	
	
	public static void main(String[] args) {
		NotificationFactory factory=new EmailNotificationFactory();
		Notification createNotification = factory.createNotification();
		createNotification.notifyMe();
	}

}
