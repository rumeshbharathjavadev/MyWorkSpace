package com.predicate.com;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

public class PredicateDemo {

	public static void main(String[] args) throws IOException {

		
		String Filename ="C:\\Users\\PC\\Desktop\\Testingfile.txt";
		
		Properties properties = new Properties();
		
		FileInputStream fileInputStream= new FileInputStream(Filename);
		
		properties.load(fileInputStream);
		
		
		String name= properties.getProperty("PLEASESELECTPRIORITY");
		
		System.out.println(name);
		
		FileOutputStream fileOutputStream = new FileOutputStream(Filename);
		
		properties.setProperty("PLEASESELECTPRIORITY", "Ok dac Mapla Pakkalm");
		
		properties.store(fileOutputStream, "Update Panniyachi Da Pangu");
		
		fileInputStream.close();
		fileOutputStream.close();
	}

}
