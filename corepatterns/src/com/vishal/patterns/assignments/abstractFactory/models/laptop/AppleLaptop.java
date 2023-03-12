package com.vishal.patterns.assignments.abstractFactory.models.laptop;

public class AppleLaptop implements Laptop {

	@Override
	public void createHardware() {
		System.out.println("creating apple laptop hardware");
	}

	@Override
	public void createSoftware() {
		System.out.println("creating apple laptop software");
	}

}
