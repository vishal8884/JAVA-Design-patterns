package com.vishal.patterns.flyweight.withAbstractClassSavesMemory;

public class Runner {

	public static void main(String[] args) {

		PaintApp app = new PaintApp();   // this type is used because object created in for loop is only once ...catche is maintained in hashmap
		
		app.render(10);
	}

}
