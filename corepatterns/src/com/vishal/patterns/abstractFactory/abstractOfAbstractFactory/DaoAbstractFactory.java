package com.vishal.patterns.abstractFactory.abstractOfAbstractFactory;

import com.vishal.patterns.abstractFactory.daoImpl.Dao;

public abstract class DaoAbstractFactory {

	public abstract Dao createDao(String type);
	
}
