package com.vishal.patterns.assignments.factory;

import com.vishal.patterns.assignments.factory.Mobile.AppleMobile;
import com.vishal.patterns.assignments.factory.Mobile.Mobile;
import com.vishal.patterns.assignments.factory.Mobile.MotorolaMobile;
import com.vishal.patterns.assignments.factory.Mobile.SamsungMobile;

public class MobileFactory {

	public Mobile prepareMobile(String brand) {
		Mobile mobile = null;

		if (brand == "samsung") {
			mobile = new SamsungMobile();
		} else if (brand == "apple") {
			mobile = new AppleMobile();
		} else if (brand == "moto") {
			mobile = new MotorolaMobile();
		}
		return mobile;
	}

}
