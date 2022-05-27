package com.vishal.patterns.abstractFactory.daoImpl;

public class DBDeptDao implements Dao {

	@Override
	public void save() {
       System.out.println("saving department to db ");
	}

}
