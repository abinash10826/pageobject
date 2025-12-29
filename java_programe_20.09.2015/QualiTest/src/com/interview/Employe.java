package com.interview;

public class Employe  {
	
	int empid;
	String empname;
	
	public Employe(int empid,String empname) 
	{
		this.empid=empid;
		this.empname=empname;
	}

	@Override
	public String toString() {
		return "Employe [empid=" + empid + ", empname=" + empname + "]";
	}
	

}
