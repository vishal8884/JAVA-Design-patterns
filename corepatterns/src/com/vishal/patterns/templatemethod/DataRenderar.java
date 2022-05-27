package com.vishal.patterns.templatemethod;

public abstract class DataRenderar {

	public void render() {
		
		String data = readData();
		String processedData = processData(data);
		
		System.out.println("processed data :: "+processedData);
	}
	
	
	public abstract String readData();
	
	public abstract String processData(String data);
}
