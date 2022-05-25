package com.vishal.patterns.singleton;

public class DateUtil {

	private static volatile DateUtil instance;                  //marked volatile to avoid multithreading issues

//	static {
//		instance = new DateUtil();
//	}
	
	private DateUtil() {

	}

//	public static synchronized DateUtil getInstance() {    //added synchronized to make it thread safe
//		if (instance == null)
//			instance = new DateUtil();  //lazy instantiation
//		return instance;
//	}
	
	public static DateUtil getInstance() {    //added synchronized  blockto make it thread safe
		if (instance == null) {               // only if instance is null we need to acquire the lock
		synchronized (DateUtil.class) {
			if (instance == null)
				instance = new DateUtil();  //lazy instantiation
		}
		}
		return instance;
	}
}
