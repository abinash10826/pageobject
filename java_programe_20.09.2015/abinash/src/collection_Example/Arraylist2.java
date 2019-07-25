package collection_Example;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Arraylist2 {
	
	public static void main(String[] args) {
		
		List list=new ArrayList();
		
		list.add("abinash");
		list.add("is");
		list.add("a");
		list.add("java");
		list.add("master");
		list.add("well done");
		list.add("deserve");
		list.add("100");
	
		Iterator i=list.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
	}

}
