package com.vishal.patterns.adapter;

public class WeatherUI {

	public void showTemperature(int zipcode) {
		WeatherAdapter adapter = new WeatherAdapter();
		int temperature = adapter.findTemperature(zipcode);
		
		
		System.out.println("temperature :: "+temperature);
	}
}
