package com.interview;

import java.util.Comparator;

public class Sortedby_id implements Comparator<Employe> {

	@Override
	public int compare(Employe o1, Employe o2) {
		
		return o1.empid-o2.empid;
	}

}
