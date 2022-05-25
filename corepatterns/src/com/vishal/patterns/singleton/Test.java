package com.vishal.patterns.singleton;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Test {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		DateUtil dateUtil1 = DateUtil.getInstance();
		DateUtil dateUtil2 = DateUtil.getInstance();
		
		System.out.println(dateUtil1 == dateUtil2);   //both dateUtil1 and dateUtil2 are same
		
		
		/////////////////////////////////serialization related//////////////////////////////////////////
		
		DateUtilSeriazible dateUtilSeriazible1 = DateUtilSeriazible.getInstance();
		DateUtilSeriazible dateUtilSeriazible2 = null;
		
		ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(new File("F:\\Project related files\\JAVA design patterns\\JAVA-Design-patterns\\resources\\dateUtil.ser")));
	    oos.writeObject(dateUtilSeriazible1);
	    
	    ObjectInputStream ois = new ObjectInputStream(new FileInputStream(new File("F:\\Project related files\\JAVA design patterns\\JAVA-Design-patterns\\resources\\dateUtil.ser")));
	    dateUtilSeriazible2 = (DateUtilSeriazible) ois.readObject();
	    
	    System.out.println(dateUtilSeriazible1 == dateUtilSeriazible2);
	    
	    oos.close();
	    ois.close();
	    
	    
	}

}
