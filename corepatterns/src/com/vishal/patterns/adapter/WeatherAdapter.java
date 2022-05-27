package com.vishal.patterns.adapter;

public class WeatherAdapter {

	public int findTemperature(int zipCode) {
		
		String city = null;
		
		if(zipCode == 560043) {
			city ="Bangalore";
		}
		else if(zipCode == 60000) {
			city = "Mumbai";
		}
		
		WeatherFinder finder = new WeatherFinderImpl();
		
		int temperature = finder.find(city);
		
		return temperature;
	}
}
