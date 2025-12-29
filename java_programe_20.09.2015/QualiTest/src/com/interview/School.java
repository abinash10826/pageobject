package com.interview;

public class School implements Comparable<School>{
	
	int id;
	int rollno;
	@Override
	public String toString() {
		return "School [id=" + id + ", rollno=" + rollno + ", name=" + name + "]";
	}

	String name;
	
	public School(int id,int rollno,String name)
	{
		this.id=id;
		this.rollno=rollno;
		this.name=name;
	}

	@Override
	public int compareTo(School o) {
		return this.name.compareTo(o.name);
	}

}
