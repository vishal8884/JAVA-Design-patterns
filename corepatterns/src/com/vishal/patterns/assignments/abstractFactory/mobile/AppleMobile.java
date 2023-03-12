package com.vishal.patterns.assignments.abstractFactory.mobile;

public class AppleMobile implements Mobile{

	@Override
	public void insertHardWare() {
		System.out.println("inserting apple hardware");
	}

	@Override
	public void insetSoftware() {
		System.out.println("inserting apple software");
	}

}
