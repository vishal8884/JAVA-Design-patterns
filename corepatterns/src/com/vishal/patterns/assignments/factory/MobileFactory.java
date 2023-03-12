package com.vishal.patterns.assignments.factory;

import com.vishal.patterns.assignments.factory.MobileImpl.AppleMobile;
import com.vishal.patterns.assignments.factory.MobileImpl.MotorolaMobile;
import com.vishal.patterns.assignments.factory.MobileImpl.SamsungMobile;

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
