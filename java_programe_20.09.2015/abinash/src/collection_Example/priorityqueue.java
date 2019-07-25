package collection_Example;

import java.util.PriorityQueue;

public class priorityqueue {

	public static void main(String[] args) {
                  
		PriorityQueue<String> list=new PriorityQueue<String>();
		
		list.add("Amit");  
	    list.add("Vijay");  
		list.add("Karan");  
		list.add("Jai");  
		list.add("Rahul");
		
		for(Object o:list)
		{
			System.out.println(o);
		}
		
	}

}
