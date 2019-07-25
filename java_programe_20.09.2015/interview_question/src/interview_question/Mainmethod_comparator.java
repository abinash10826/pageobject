package interview_question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class Mainmethod_comparator {
	
	public static void main(String[] args) {
		TreeSet<Student> set=new TreeSet<Student>(new Name());
	List<Student> list=new ArrayList<Student>();
	
	Collections.sort(list,new Name());
		
		set.add(new Student("nikhil",1290,12));
		set.add(new Student("rahul",1279,13));
		set.add(new Student("abinash",1280,14));
		set.add(new Student("sushant",1281,15));
		
		//Collections.sort(set,new Name());
		for(Student result:set)
		{
			System.out.println(result.name+result.id+result.rollno);
		}
	}

}
