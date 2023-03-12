package com.vishal.patterns.assignments.factory;

import com.vishal.patterns.assignments.factory.Mobile.Mobile;

public class MobileStore {

	public void orderMobile(String brand) {
		MobileFactory mobileFactory = new MobileFactory();
		Mobile mobile = mobileFactory.prepareMobile(brand);
		
		mobile.insertHardWare();
		mobile.insetSoftware();
		
	}
}
