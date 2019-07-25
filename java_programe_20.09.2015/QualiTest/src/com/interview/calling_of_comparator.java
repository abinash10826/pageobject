package com.interview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class calling_of_comparator {
	
	public static void main(String[] args) {
		
		List<Employe> list=new ArrayList<Employe>();
		
		list.add(new Employe(32, "abinash"));
		list.add(new Employe(30, "nikhil"));
		
		Collections.sort(list, new Sortedby_id());
		
		for(Employe e:list)
		{
			System.out.println(e);
		}
	}

}
