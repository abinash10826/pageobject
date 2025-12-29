package com.interview;

import java.io.Serializable;

public class Serialization implements Serializable {
	
	int id;
	int empno;
    final transient  String empname;
	
	public Serialization(int id,int empno,String empname)
	{
		this.id=id;
		this.empno=empno;
		this.empname=empname;
	}

}
