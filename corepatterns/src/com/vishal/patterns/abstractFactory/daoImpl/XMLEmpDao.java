package com.vishal.patterns.abstractFactory.daoImpl;

public class XMLEmpDao implements Dao {

	@Override
	public void save() {
       System.out.println("saving employee to xml");
	}

}
