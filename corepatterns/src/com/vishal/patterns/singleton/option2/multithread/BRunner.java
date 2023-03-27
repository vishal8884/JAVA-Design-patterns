package com.vishal.patterns.singleton.option2.multithread;

public class BRunner {

	public static void main(String[] args) {

		Thread t1 = new Thread(() -> {
			B obj1 = B.getBInstance();
			Thread.currentThread().setName("t1"); 	
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("current thread :: "+Thread.currentThread().getName());
		});
		
		
		Thread t2 = new Thread(() -> {
			B obj2 = B.getBInstance();
			Thread.currentThread().setName("t2"); 	
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("current thread :: "+Thread.currentThread().getName());
		});
		
		
		Thread t3 = new Thread(() -> {
			B obj3 = B.getBInstance();
			Thread.currentThread().setName("t3"); 	
			try {
				Thread.sleep(5000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			System.out.println("current thread :: "+Thread.currentThread().getName());
		});
		
		t1.run();
		t2.run();
		t3.run();
		
		
	}

}
