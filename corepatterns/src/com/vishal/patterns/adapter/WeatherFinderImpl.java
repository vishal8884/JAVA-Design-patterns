package com.vishal.patterns.adapter;

public class WeatherFinderImpl implements WeatherFinder {

	@Override
	public int find(String city) {
		if(city.equals("Bangalore"))
		    return 88;
		else if(city.equals("Mumbai"))
			return 100;
		else return -1;
	}

}
