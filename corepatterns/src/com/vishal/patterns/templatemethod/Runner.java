package com.vishal.patterns.templatemethod;

public class Runner {

	public static void main(String[] args) {

		DataRenderar renderer = new XMLDataRenderer();
		renderer.render();
		
		
		DataRenderar renderer2 = new CSVDataRenderer();
		renderer2.render();
		
	}

}
