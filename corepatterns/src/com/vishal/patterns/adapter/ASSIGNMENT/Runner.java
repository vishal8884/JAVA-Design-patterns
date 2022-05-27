package com.vishal.patterns.adapter.ASSIGNMENT;

public class Runner {

	public static void main(String[] args) {

		PaymentApp app = new PaymentApp();
		
		String amountPaid = app.pay(5000);
		
		System.out.println("amount paid dollars:: "+amountPaid);
	}

}
