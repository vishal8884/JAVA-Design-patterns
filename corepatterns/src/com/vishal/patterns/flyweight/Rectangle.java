package com.vishal.patterns.flyweight;

public class Rectangle implements Shape {

	private String label;
	private int length;
	private int breath;
	private String fillStyle;

	public Rectangle() {
		label = "rectangle";
	}
	
	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getBreath() {
		return breath;
	}

	public void setBreath(int breath) {
		this.breath = breath;
	}

	public String getFillStyle() {
		return fillStyle;
	}

	public void setFillStyle(String fillStyle) {
		this.fillStyle = fillStyle;
	}

	@Override
	public void draw() {

		System.out
				.println("label :: " + label + "               length :: " + length + "    breath :: " + breath + "    fillStyle");
		System.out.println();
	}

}
