package com.interview;

public class Singletone {
	
	final static Singletone ref=new Singletone(1234,10826);
	
	int id;
	int rollno;
	
	private Singletone(int id,int rollno)
	{
		this.id=id;
		this.rollno=rollno;
	}
	
	public static Singletone getback()
	{
		System.out.println("hello");
		System.out.println(20+20);
		return ref;
	}

}
