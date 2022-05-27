package com.vishal.patterns.adapter.ASSIGNMENT;

public class PaymentApp {

	public String pay(int rupees) {
		
		PaymentAdapter pa = new PaymentAdapter();
		int dollars = pa.getDollars(rupees);
		
		return "amount paid ::"+dollars;
	}
}
