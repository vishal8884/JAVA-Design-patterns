package com.vishal.patterns.templatemethod;

public class CSVDataRenderer extends DataRenderar {

	@Override
	public String readData() {
		return "CSV Data";
	}

	@Override
	public String processData(String data) {
		
		return "Processed "+data;
	}

}
