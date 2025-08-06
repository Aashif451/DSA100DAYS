package com.DSA.designPattern.behavioral.stretgy;

public class StreategyDesignPattern {
	
	
	public static void main(String[] args) {
		PaymentProcessing payProcessing=new DebitCardPayment();
		payProcessing.pay();
	}
	

}
