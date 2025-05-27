package com.DSA.designPattern.creational;

public class EmailNotification implements Notification{

	@Override
	public void notifyMe() {
		System.out.println("Email Send to its related Class");
		
	}

}
