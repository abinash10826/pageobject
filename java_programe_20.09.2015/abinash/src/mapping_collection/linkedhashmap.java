package mapping_collection;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class linkedhashmap {
	
	public static void main(String[] args) {
		
		LinkedHashMap<Integer,String> list=new LinkedHashMap<>();
		
		list.put(1, "abiansh");
		list.put(4, "pintu");
		list.put(6, "ram");
		list.put(8, "nikhil");
		list.put(9, "python");
		list.put(7, "java");
		//Set set=list.entrySet();
		for(Map.Entry entry:list.entrySet())
		{
			System.out.println(entry);
		}
		
		
	}

}
