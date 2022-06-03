package com.vishal.patterns.decorator;

public class PizzaShop {

	public static void main(String[] args) {

		Pizza pizza = new PlainPizza();
		pizza.bake();
		
		System.out.println("===========================================================================");
		
		Pizza cheesePizza = new CheesePizzaDecorator(new PlainPizza());
		cheesePizza.bake();
		
		
		System.out.println("===========================================================================");
		
		Pizza veggiePizzaWithCheese = new VeggiePizzaDecorator(new CheesePizzaDecorator(new PlainPizza()));
		veggiePizzaWithCheese.bake();
	}

}
