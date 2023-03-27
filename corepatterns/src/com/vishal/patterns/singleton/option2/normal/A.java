package com.vishal.patterns.singleton.option2.normal;

public class A {

	private static A obj = new A();
	
	private A() {
        System.out.println("private constructor of A class initialized");
	}
	
	
	public static A getInstance() {
		return obj;
	}
	
	public void printMyName(String name) {
		
		System.out.println("Hello mr/mrs "+name.toUpperCase()+" !");
	}
}
