package com.vishal.patterns.singleton;

public class Test {

	public static void main(String[] args) {

		DateUtil dateUtil1 = DateUtil.getInstance();
		DateUtil dateUtil2 = DateUtil.getInstance();
		
		System.out.println(dateUtil1 == dateUtil2);   //both dateUtil1 and dateUtil2 are same
	}

}
