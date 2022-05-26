package com.vishal.patterns.factory.person;

public class PersonFactory {

	public static Person createPerson(String gender) {
		
		Person p = null;
		
		if(gender.equals("male")) {
			p=new Male();
		}
		if(gender.equals("female")) {
			p = new Female();
		}
		if(gender.equals("transgender")) {
			p = new Transgender();
		}
		
		return p;
	}
}
