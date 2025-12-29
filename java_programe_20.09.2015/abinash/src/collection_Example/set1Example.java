package collection_Example;

import java.util.HashSet;

public class set1Example {
	
	public static void main(String[] args) {
		
        HashSet list=new HashSet();
		
		list.add("abiansh");
		list.add("vijay");
		list.add("pintu");
		list.add("priyanka");
		list.add("nikhil");
		list.add("java");
		System.out.println("before remove "+list);
		
	    list.remove("pintu");
	    
	    System.out.println("after remove "+list);
	    

        HashSet list1=new HashSet();
		
		list1.add("sumit");
		list1.add("ravi");
		list1.add("anu");
		list1.add("gourav");
		
		list.addAll(list1);
		
		System.out.println("after adding "+list);
		
		list.removeAll(list1);
		System.out.println(list);
	
		list.clear();
		
		
		
	
	}

}
