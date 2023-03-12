package com.vishal.patterns.assignments.abstractFactory.models.tablet;

public class SamsungTablet implements Tablet {

	@Override
	public void createHardware() {
		System.out.println("creating samsung tablet hardware");
	}

	@Override
	public void createSoftware() {
		System.out.println("creating samsung tablet software");
	}

}
