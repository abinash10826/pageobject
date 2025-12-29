package collection_Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class user_defined_class_arraylist {
	
	public static void main(String[] args) {
		
		Student st=new Student(1234, "abinash", 26);
		Student st1=new Student(4321, "anand", 62);
		
		
		List <Student> list=new ArrayList<Student>();
		
                list.add(st);
                list.add(st1);
                
               /* Iterator i=list.iterator();
                
                while(i.hasNext())
                {
                	Student std=(Student) i.next();
                	
                	System.out.println(std.id+" "+std.name+" "+std.age);
                	
                	
                }*/
                
                
                for(Student std:list)
                {
                	System.out.println(std.id+" ----"+std.name+" ----"+std.age);
                }
                
                System.out.println(list.get(1).age);
		
	}

}
