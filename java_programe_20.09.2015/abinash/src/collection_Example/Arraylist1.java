package collection_Example;

import java.util.ArrayList;

public class Arraylist1 {

	public static void main(String[] args) {
		
		ArrayList list=new ArrayList();
		
		
		list.add("abinash");
		list.add("is");
		list.add("a");
		list.add("java");
		list.add("master");
		list.add("well done");
		list.add("deserve");
		list.add(100);
		
		System.out.println(list);
		
		 for(Object o:list)
		 {
			 //System.out.println(o+" ");
			 
			 String s=o.toString();
			 System.out.println(s);
			 
		 }
		 
		                    
	}

}
