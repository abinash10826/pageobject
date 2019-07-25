package com.api.project;

import java.io.Serializable;

public class School implements Serializable
{
	
	int id;
	int rollno;
	String name;
	
	public School(int id,int rollno,String name)
	{
		this.id=id;
		this.rollno=rollno;
		this.name=name;
	}

}
