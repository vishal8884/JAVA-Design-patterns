package com.vishal.patterns.singleton;

import java.io.Serializable;

public class DateUtilSeriazible implements Serializable, Cloneable {

	private static final long serialVersionUID = 1L;
	private static volatile DateUtilSeriazible instance;                  //marked volatile to avoid multithreading issues

//	static {
//		instance = new DateUtil();
//	}
	
	private DateUtilSeriazible() {

	}

//	public static synchronized DateUtil getInstance() {    //added synchronized to make it thread safe
//		if (instance == null)
//			instance = new DateUtil();  //lazy instantiation
//		return instance;
//	}
	
	public static DateUtilSeriazible getInstance() {    //added synchronized  blockto make it thread safe
		if (instance == null) {               // only if instance is null we need to acquire the lock
		synchronized (DateUtil.class) {
			if (instance == null)
				instance = new DateUtilSeriazible();  //lazy instantiation
		}
		}
		return instance;
	}
	
	protected Object readResolve() {       //should use readResolve only ..its used to solve deserialization issue in singleton
		return instance;
	}
	
	@Override
	protected Object clone() throws CloneNotSupportedException {       //does not allow to be cloned
		throw new CloneNotSupportedException();
	}
}
