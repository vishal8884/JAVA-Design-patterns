package com.vishal.patterns.assignments.abstractFactory.models.laptop;

public class AcerLaptop implements Laptop {

	@Override
	public void createHardware() {
		System.out.println("creating acer laptop hardware");
	}

	@Override
	public void createSoftware() {
		System.out.println("creating acer laptop software");
	}

}
