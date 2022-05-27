package com.vishal.patterns.flyweight;

public class Circle implements Shape {

	private String label;
	private int radius;
	private String fillColor;
	private String lineColor;

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public String getFillColor() {
		return fillColor;
	}

	public void setFillColor(String fillColor) {
		this.fillColor = fillColor;
	}

	public String getLineColor() {
		return lineColor;
	}

	public void setLineColor(String lineColor) {
		this.lineColor = lineColor;
	}

	public Circle() {
		label = "circle";
	}

	@Override
	public void draw() {
		System.out.println("label :: " + label + "                radiius :: " + radius + "    fillColor :: " + fillColor
				+ "     lineColor :: " + lineColor);
		System.out.println();
	}

}
