package collection_Example;

import java.util.TreeSet;

public class Comparable_interface {
	
	public static void main(String[] args) {
		TreeSet<Employe> set=new TreeSet<Employe>();
		set.add(new Employe(20,"abinash",40000));
		set.add(new Employe(12,"nikhil",50000));
		set.add(new Employe(350,"lucky",30000));
		set.add(new Employe(18,"ram",20000));
		
		
		
		
		
		
		for(Object o:set)
		{
			System.out.println(o.toString());
		}
		
		System.out.println(set.toString());
	}

}
