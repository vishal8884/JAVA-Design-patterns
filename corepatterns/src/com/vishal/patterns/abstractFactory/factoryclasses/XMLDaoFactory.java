package com.vishal.patterns.abstractFactory.factoryclasses;

import com.vishal.patterns.abstractFactory.daoImpl.Dao;
import com.vishal.patterns.abstractFactory.daoImpl.XMLDeptDao;
import com.vishal.patterns.abstractFactory.daoImpl.XMLEmpDao;

public class XMLDaoFactory extends DaoAbstractFactory {

	@Override
	public Dao createDao(String type) {
		
		Dao dao = null;
		
		if(type.equals("emp")) {
			dao = new XMLEmpDao();
		}
		else if(type.equals("dept")) {
			dao = new XMLDeptDao();
		}
		
		return dao;
	}

}
