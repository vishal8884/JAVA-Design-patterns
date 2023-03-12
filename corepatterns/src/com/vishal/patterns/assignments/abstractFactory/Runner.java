package com.vishal.patterns.assignments.abstractFactory;

public class Runner {

	public static void main(String[] args) {

		AbstractDeviceFactory abstractDeviceFactory = DeviceFactoryProducer.produceDevice("tab");
		abstractDeviceFactory.createDevice("samsung");
	}
}
