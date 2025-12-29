package com.interview;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class deserialization {
	
	public static void main(String[] args) throws Throwable {
		
		FileInputStream fil=new FileInputStream("E:\\New folder\\serialization.ser");
		
		ObjectInputStream obj=new ObjectInputStream(fil);
		
		Object obj1=obj.readObject();
		
		Serialization ref=(Serialization)obj1;
		
		System.out.println(ref.id);
		System.out.println(ref.empno);
		System.out.println(ref.empname);
				
		
		
	}

}
