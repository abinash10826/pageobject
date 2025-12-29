package mapping_collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Mainmethod {

	public static void main(String[] args) {
		
         Map<Integer, Book> map=new HashMap<Integer, Book> ();
         
       //Creating Books    
         Book b1=new Book(101,"Let us C","Yashwant Kanetkar","BPB",8);    
         Book b2=new Book(102,"Data Communications & Networking","Forouzan","Mc Graw Hill",4);    
         Book b3=new Book(103,"Operating System","Galvin","Wiley",6);    
         
         map.put(4, b1);
         map.put(6, b2);
         map.put(8, b3);
         /*//Traversing map  
         for(Map.Entry<Integer, Book> entry:map.entrySet()){    
             int key=entry.getKey();  
             Book b=entry.getValue();  
             System.out.println(key+" Details:");  
             System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);   
         }  
         */
           
         
         Set input=map.entrySet();
         
         
         for(Object o:input)
         {
        	 
        	 System.out.println(o);
         }
         
         
         
         
	}
	

}
