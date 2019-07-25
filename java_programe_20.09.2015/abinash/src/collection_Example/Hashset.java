package collection_Example;

import java.util.HashSet;

public class Hashset {
	
	public static void main(String[] args) {
		
		HashSet set=new HashSet();
		
		set.add("abinash");
		set.add("abinash");
		
		
		for(Object o:set)
		{
			System.out.println(o);
		}
	}

}
