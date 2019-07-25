package collection_Example;

import java.util.LinkedList;
import java.util.Queue;

public class queue {

	public static void main(String[] args) {
                     
		Queue<String> list=new LinkedList<String>();
		
		list.add("Amit");  
	    list.add("Vijay");  
		list.add("Karan");  
		list.add("Jai");  
		list.add("Rahul"); 
		list.add(null);
		System.out.println(list);
		System.out.println("-----------------");
		System.out.println("after poll: "+list.poll());
		System.out.println("-----------------");
		System.out.println("after peek: "+list.peek());
		System.out.println("------------------");
		System.out.println("after remove: "+list.remove());
		System.out.println("------------------");
		System.out.println("after element: "+list.element());
		
		for(Object o:list)
		{
			System.out.println(o);
		}
		
		
		
	}

}
