package com.vishal.patterns.templatemethod;

public class XMLDataRenderer extends DataRenderar {

	@Override
	public String readData() {
		return "XML Data";
	}

	@Override
	public String processData(String data) {
		
		return "Processed "+data;
	}

}
