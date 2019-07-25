package com.interview;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Serialization_calling {
	
	public static void main(String[] args) throws Throwable {
		
		Serialization ref=new Serialization(1234, 10826, "abinash");
		
		FileOutputStream fil=new FileOutputStream("E:\\New folder\\serialization.ser");
		
		ObjectOutputStream obj=new ObjectOutputStream(fil);
		
		obj.writeObject(ref);
		
		obj.close();
	}

}
