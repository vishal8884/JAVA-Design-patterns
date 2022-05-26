package com.vishal.patterns.factory.person;

public class Female implements Person {

	@Override
	public void top() {
        System.out.println("inside Female top");
	}

	@Override
	public void bottom() {
		System.out.println("inside Female bottom");
	}

}
