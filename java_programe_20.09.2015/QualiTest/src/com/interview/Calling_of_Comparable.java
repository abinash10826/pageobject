package com.interview;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Calling_of_Comparable {
	
	public static void main(String[] args) {
		
		List<School> list=new ArrayList<School>();
		
		list.add(new School(10, 10826, "abinash"));
		list.add(new School(11, 10827, "nikhil"));
		list.add(new School(12, 10829, "ranjib"));
		list.add(new School(13, 10828, "krishna"));
		
	Collections.sort(list);
	
	    for(School s:list)
	    {
	    	System.out.println(s);
	    }
	}

}
