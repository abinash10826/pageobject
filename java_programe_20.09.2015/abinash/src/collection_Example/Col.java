package collection_Example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Col {

	public static void main(String[] args) {

              List list=new ArrayList();
              
              list.add("abiansh");
              list.add("pintu");
              list.add("java");
              list.add("c");
              list.add("c");
              list.add("java");
              
              List dup=new ArrayList();
              
              for(Object o:list)
              {
            	  if(dup.contains(o))
            	  {
            		  dup.add(o);
            		  
            	  }
		}
               System.out.println(dup);
	}

}
