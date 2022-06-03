package com.vishal.patterns.abstractFactory.factoryclasses;

import com.vishal.patterns.abstractFactory.daoImpl.DBDeptDao;
import com.vishal.patterns.abstractFactory.daoImpl.DBEmpDao;
import com.vishal.patterns.abstractFactory.daoImpl.Dao;

public class DBDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {
		
		Dao dao = null;
		
		if(type.equals("emp")) {
			dao = new DBEmpDao();
		}
		else if(type.equals("dept")) {
			dao = new DBDeptDao();
		}
		
		return dao;
	}

}
