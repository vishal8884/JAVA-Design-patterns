package com.vishal.patterns.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ReflectionProblem {

	//in reflection problem we can loop throup constructor and make it accessible
	
	// we use enums to fix it
	
	public static void main(String[] args) {
		DateUtilSeriazible instance1 = DateUtilSeriazible.getInstance();
		DateUtilSeriazible instance2 = null;
		
		Constructor[] constructors = DateUtilSeriazible.class.getDeclaredConstructors();
		
		for (Constructor constructor : constructors) {
			constructor.setAccessible(true);
			try {
				instance2 = (DateUtilSeriazible) constructor.newInstance();
				break;
			} catch (InstantiationException | IllegalAccessException | IllegalArgumentException
					| InvocationTargetException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
		
		System.out.println(instance1.hashCode());
		System.out.println(instance2.hashCode());
	}
}
