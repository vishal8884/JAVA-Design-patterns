package com.vishal.patterns.factory.person;

public class Transgender implements Person {

	@Override
	public void top() {
        System.out.println("inside transgender top");
	}

	@Override
	public void bottom() {
		System.out.println("inside transgender bottom");
	}

}
