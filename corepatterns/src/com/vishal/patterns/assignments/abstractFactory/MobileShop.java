package com.vishal.patterns.assignments.abstractFactory;

public class MobileShop {

	public void orderMobile(String brand) {
		MobileFactory mobileFactory = new MobileFactory();
		mobileFactory.createMobile(brand);
	}
}
