package com.vishal.patterns.adapter.ASSIGNMENT;

public class PaymentProcessorImpl implements PaymentProcessor {

	@Override
	public String pay(int dollars) {

		return "paid amount"+dollars;
	}

}
