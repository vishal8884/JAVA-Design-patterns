package com.vishal.patterns.abstractFactory;

import com.vishal.patterns.abstractFactory.abstractOfAbstractFactory.DBDaoFactory;
import com.vishal.patterns.abstractFactory.abstractOfAbstractFactory.DaoAbstractFactory;
import com.vishal.patterns.abstractFactory.abstractOfAbstractFactory.XMLDaoFactory;

public class DaoFactoryProducer {

	public static DaoAbstractFactory produce(String factoryType) {
		DaoAbstractFactory daf = null;
		
		
		if(factoryType.equals("xml")) {
			daf = new XMLDaoFactory();
		}
		else if(factoryType.equals("db")) {
			daf = new DBDaoFactory();
		}
		
		return daf;
	}
}
