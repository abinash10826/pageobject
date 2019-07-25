package com.api.project;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.ObjectInputStream;

public class Deserialization {
	
	public static void main(String[] args) throws Throwable {
		
		FileInputStream in=new FileInputStream("E:\\serializable\\School.ser.txt");
		
		ObjectInputStream object=new ObjectInputStream(in);
		
		          Object obj=object.readObject();
		          
		          System.out.println(obj);
		          
		          School st=(School)obj;
		          
		          System.out.println("Id is "+ st.id);
		          System.out.println("roll no is "+ st.rollno);
		          System.out.println("name is "+ st.name);
	}

}
