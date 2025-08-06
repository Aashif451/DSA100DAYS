package com.DSA.designPattern.creational.factory;

public class SMSnotifications implements Notification{

	@Override
	public void notifyMe() {
		System.out.println("this is the SMS notification implemented by Notifyme");
		
	}

}
