package com.vishal.patterns.singleton.option2.normal;

public class Runner {

	public static void main(String[] args) {
		A a = A.getInstance();
		A a2 = A.getInstance();
		A a3 = A.getInstance();
		
		a.printMyName("Vishal");
		a2.printMyName("abc");
		
		boolean check = a == a2;
		System.out.println("check :: "+check);
	}
	
}
