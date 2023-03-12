package com.vishal.patterns.assignments.factory.Mobile;

public class MotorolaMobile implements Mobile{

	@Override
	public void insertHardWare() {
		System.out.println("inserting motorola hardware");
	}

	@Override
	public void insetSoftware() {
		System.out.println("inserting motorola software");
	}

}
