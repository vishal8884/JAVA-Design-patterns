package com.vishal.patterns.factory.pizza;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		PizzaStore ps = new PizzaStore();
		ps.orderPizza("cheese");
		
		
		//we use oracle/mysql/sql server but use only one object to create it same happens behind the scenes
	}

}
