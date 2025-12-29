package interview_Question1;

import java.util.HashMap;

public class DuplicateWord_And_Occurance {
	
	public static void main(String[] args) {
		
		String str="Abinash java Abinash java pintu xyz xyz java";
		 
		       String[] str1=str.split(" ");
		       
		       int count=0;
		       
		       HashMap<String, Integer> map=new HashMap<String,Integer>();
		       
		       for (int i = 0; i < str1.length; i++) {
		    	   
		    	           count=0;
		    	   
		    	   for (int j = 0; j < str1.length; j++) {
		    		   
		    		   if(str1[i].equalsIgnoreCase(str1[j]))
		    		   {
		    			   count++;
		    		   }
					
				}
		    	   
		    	   if(count>1)
		    	   
		    	   map.put(str1[i], count);
				
			}
		       
		       System.out.println(map);
		
	}

}
