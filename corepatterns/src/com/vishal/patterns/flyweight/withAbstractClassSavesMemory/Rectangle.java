package com.vishal.patterns.flyweight.withAbstractClassSavesMemory;

public class Rectangle extends Shape {

	private String label;

	public Rectangle() {
		label = "rectangle";
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	@Override
	public void draw(int length, int breadth, String fillStyle) {

		System.out.println("label :: " + label + "               length :: " + length + "    breath :: " + breadth
				+ "    fillStyle");
		System.out.println();
	}

}
