package com.vishal.patterns.flyweight.withAbstractClassSavesMemory;

public abstract class Shape {

	public void draw(int radius,String fillColor,String lineColor) {
		//no - op
	}
	
	public void draw(int length,int breadth,String fillStyle) {
		System.out.println("test");
	}
}
