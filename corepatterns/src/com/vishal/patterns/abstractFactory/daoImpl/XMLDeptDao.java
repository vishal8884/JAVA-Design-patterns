package com.vishal.patterns.abstractFactory.daoImpl;

public class XMLDeptDao implements Dao {

	@Override
	public void save() {
       System.out.println("saving department to xml");
	}

}
