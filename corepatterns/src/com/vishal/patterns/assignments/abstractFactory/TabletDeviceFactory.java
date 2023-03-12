package com.vishal.patterns.assignments.abstractFactory;

import com.vishal.patterns.assignments.abstractFactory.models.tablet.AppleTablet;
import com.vishal.patterns.assignments.abstractFactory.models.tablet.SamsungTablet;
import com.vishal.patterns.assignments.abstractFactory.models.tablet.Tablet;

public class TabletDeviceFactory implements AbstractDeviceFactory {

	public void createDevice(String brand) {
		Tablet tablet = null;
		if(brand.equals("apple")) {
			tablet = new AppleTablet();
		}
		else if(brand.equals("samsung")) {
			tablet = new SamsungTablet();
		}
		
		tablet.createHardware();
		tablet.createSoftware();
	}
}
