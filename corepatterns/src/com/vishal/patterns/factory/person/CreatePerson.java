package com.vishal.patterns.factory.person;

public class CreatePerson {

	public Person createPerson(String gender) {
		Person p = PersonFactory.createPerson(gender);
		
		p.top();
		p.bottom();
		
		
		return p;
	}
}
