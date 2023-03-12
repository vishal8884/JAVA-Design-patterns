package com.vishal.patterns.assignments.abstractFactory.mobile;

public class SamsungMobile implements Mobile{

	@Override
	public void insertHardWare() {
		System.out.println("inserting samsung hardware");
	}

	@Override
	public void insetSoftware() {
		System.out.println("inserting samsung software");
		
	}

}
