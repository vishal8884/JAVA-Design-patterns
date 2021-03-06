package com.vishal.patterns.abstractFactory;

import com.vishal.patterns.abstractFactory.daoImpl.Dao;
import com.vishal.patterns.abstractFactory.factoryclasses.DaoAbstractFactory;

public class Runner {

	public static void main(String[] args) {

		DaoAbstractFactory daf = DaoFactoryProducer.produce("xml");
		Dao dao = daf.createDao("emp");
		
		dao.save();
	}

}
