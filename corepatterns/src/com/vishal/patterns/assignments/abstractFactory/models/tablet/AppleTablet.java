package com.vishal.patterns.assignments.abstractFactory.models.tablet;

public class AppleTablet implements Tablet {

	@Override
	public void createHardware() {
		System.out.println("creating apple tablet hardware");
	}

	@Override
	public void createSoftware() {
		System.out.println("creating apple tablet software");
	}

}
