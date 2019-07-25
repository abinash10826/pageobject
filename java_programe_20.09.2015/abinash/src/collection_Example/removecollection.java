package collection_Example;

import java.util.ArrayList;
import java.util.List;

public class removecollection {

	public static void main(String[] args) {
         List list=new ArrayList();
		
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		
        List list1=new ArrayList();
        
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        
        
        list.retainAll(list1);
        
        System.out.println(list);
    
	}

}
