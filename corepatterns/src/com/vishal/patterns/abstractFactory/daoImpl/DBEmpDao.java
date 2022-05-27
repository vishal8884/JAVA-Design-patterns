package com.vishal.patterns.abstractFactory.daoImpl;

public class DBEmpDao implements Dao {

	@Override
	public void save() {
       System.out.println("saving employee to db ");
	}

}
