package com.vishal.patterns.assignments.abstractFactory;

public class DeviceFactoryProducer {

	public static AbstractDeviceFactory produceDevice(String type) {
		AbstractDeviceFactory abstractDeviceFactory= null;
		
		if(type.equals("laptop")) {
			abstractDeviceFactory = new LaptopDeviceFactory();
		}
		else if(type.equals("tab")) {
			abstractDeviceFactory = new TabletDeviceFactory();
		}
		
		return abstractDeviceFactory;
	}
}
