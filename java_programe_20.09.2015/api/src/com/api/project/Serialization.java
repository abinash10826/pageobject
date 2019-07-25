package com.api.project;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization {
	
	public static void main(String[] args) throws Throwable {
		
		School st=new School(1234,68266,"Abinash");
		
		FileOutputStream outputstream=new FileOutputStream("E:\\serializable\\School.ser.txt");
		
		
		ObjectOutputStream object=new ObjectOutputStream(outputstream);
		
		           object.writeObject(st);
		           
		           object.close();
		           
		           System.out.println("Success");
		
		
		
		
		
	}

}
