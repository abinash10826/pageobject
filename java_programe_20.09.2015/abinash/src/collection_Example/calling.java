package collection_Example;

import java.util.Iterator;
import java.util.TreeSet;

public class calling {
	
	public static void main(String[] args) {
		
		TreeSet<Student> set=new TreeSet<>(new Agecomparator());
		
		set.add(new Student(20,"abinash",40));
		set.add(new Student(12,"nikhil",50));
		set.add(new Student(350,"lucky",30));
		set.add(new Student(18,"ram",20));
		

		
		 for(Student st:set)
		 {
			 System.out.println(st);
		 }
		
		
		
		
		
	}

}
