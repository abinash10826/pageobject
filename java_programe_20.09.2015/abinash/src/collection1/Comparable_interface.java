package collection1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Comparable_interface {
	
	public static void main(String[] args) {
		
		ArrayList<Student_comparable> list=new ArrayList<Student_comparable>();
		
		list.add(new Student_comparable(24,"pintu",1234));
		list.add(new Student_comparable(26,"ram",5678));
		list.add(new Student_comparable(26,"ranjib",8796));
		list.add(new Student_comparable(28,"nikhil",9876));
		
		Collections.sort(list);
		for(Student_comparable std:list)
		{
			System.out.println(std);
		}



	}

}
