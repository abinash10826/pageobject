package mapping_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Hashmap {

	public static void main(String[] args) {
		
		
		Map <Integer,String>map=new HashMap<Integer,String>();
		
		map.put(1, "abiansh");
		map.put(4, "pintu");
		map.put(6, "ram");
		map.put(8, "nikhil");
		map.put(9, "python");
		map.put(7, "java");
		
		//Set result=map.entrySet();
		
		for(Map.Entry m:map.entrySet())
		{
			System.out.println(m.getKey()+" "+m.getValue());
		}
		

	}

}
