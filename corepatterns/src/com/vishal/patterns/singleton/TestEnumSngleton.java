package com.vishal.patterns.singleton;

public class TestEnumSngleton {

	public static void main(String[] args) {

		EnumSingleTonDemo instance = EnumSingleTonDemo.INSTANCE;
		
		System.out.println(instance.getName());
		
		instance.setName("Vishal");
		
		System.out.println(instance.getName());
	}

}
