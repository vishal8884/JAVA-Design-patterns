package com.vishal.patterns.assignments.abstractFactory;

import com.vishal.patterns.assignments.abstractFactory.models.laptop.AcerLaptop;
import com.vishal.patterns.assignments.abstractFactory.models.laptop.AppleLaptop;
import com.vishal.patterns.assignments.abstractFactory.models.laptop.Laptop;

public class LaptopDeviceFactory implements AbstractDeviceFactory {

	public void createDevice(String brand) {
		Laptop laptop = null;
		if(brand.equals("acer")) {
			laptop = new AcerLaptop();
		}
		if(brand.equals("apple")) {
			laptop = new AppleLaptop();
		}
		
		laptop.createHardware();
		laptop.createSoftware();
	}
}
