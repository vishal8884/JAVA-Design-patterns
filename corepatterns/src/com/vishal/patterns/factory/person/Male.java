package com.vishal.patterns.factory.person;

public class Male implements Person {

	@Override
	public void top() {
        System.out.println("inside male top");
	}

	@Override
	public void bottom() {
		System.out.println("inside male bottom");
	}

}
