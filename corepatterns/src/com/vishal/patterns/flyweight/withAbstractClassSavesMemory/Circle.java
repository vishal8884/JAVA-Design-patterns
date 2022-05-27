package com.vishal.patterns.flyweight.withAbstractClassSavesMemory;

public class Circle extends Shape {

	private String label;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public Circle() {
		label = "circle";
	}

	@Override
	public void draw(int radius, String fillColor, String lineColor) {
		System.out.println("label :: " + label + "                radiius :: " + radius + "    fillColor :: "
				+ fillColor + "     lineColor :: " + lineColor);
		System.out.println();
	}

}
