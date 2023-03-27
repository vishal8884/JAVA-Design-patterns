package com.vishal.patterns.singleton.option2.multithread;

public class B {

	private static B obj;
	
	private B () {
		System.out.println("Constructor B initialized");
	}
	
	public static B getBInstance() {
		if(obj == null) {
			synchronized (B.class) {
				if(obj == null) {
					obj = new B();
				}
			}
		}
		
		return obj;
	}
}
