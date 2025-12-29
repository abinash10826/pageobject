package collection_Example;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;

public class set {
	
	public static void main(String[] args) {
		
		LinkedHashSet list=new LinkedHashSet();
		
		list.add("abiansh");
		list.add(1234);
		list.add("pintu");
		list.add(24);
		list.add(25);
		list.add(26);
		list.add(27);
		list.add(28);
		list.add(24);
		list.add("abiansh");
		list.add(null);
		
		Iterator i=list.iterator();
		
		while(i.hasNext())
		{
			Object o=i.next();
			System.out.println(o);
		}
		
	}

}
