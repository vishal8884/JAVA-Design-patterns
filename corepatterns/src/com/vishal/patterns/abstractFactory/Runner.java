package com.vishal.patterns.abstractFactory;

import com.vishal.patterns.abstractFactory.daoImpl.Dao;
import com.vishal.patterns.abstractFactory.factoryclasses.DaoAbstractFactory;

public class Runner {

	public static void main(String[] args) {

		DaoAbstractFactory daf = DaoFactoryProducer.produce("xml");
		Dao dao = daf.createDao("emp");
		
		dao.save();
		
		
		//--------------------------------------------------------------------------------------------------------------------------------
		
		DaoAbstractFactory daf2 = DaoFactoryProducer.produce("xml");
		Dao dao2 = daf2.createDao("dept");
		
		dao2.save();
		
		//--------------------------------------------------------------------------------------------------------------------------------
		
	    DaoAbstractFactory daf3 = DaoFactoryProducer.produce("db");
		Dao dao3 = daf3.createDao("emp");
				
		dao3.save();
				
				
		//--------------------------------------------------------------------------------------------------------------------------------
				
		DaoAbstractFactory daf4 = DaoFactoryProducer.produce("db");
		Dao dao4 = daf4.createDao("dept");
				
		dao4.save();
	}

}
