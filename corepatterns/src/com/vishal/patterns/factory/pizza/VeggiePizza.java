package com.vishal.patterns.factory.pizza;

public class VeggiePizza implements Pizza {

	@Override
	public void prepare() {

		System.out.println("preparing vegiee pizza");
	}

	@Override
	public void bake() {
		System.out.println("baking vegiee pizza");
	}

	@Override
	public void cut() {
		System.out.println("cutting vegiee pizza");

	}

}
