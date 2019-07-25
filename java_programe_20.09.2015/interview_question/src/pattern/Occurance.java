package pattern;

import java.util.HashMap;

public class Occurance {
	
	public static void main(String[] args) {
		
		String str="my name is abinash";
		
		  String str1=str.replaceAll("\\s+", "");
		  
		  int count=0;
		  
		                 char[] ch=str1.toCharArray();
		          
		          
		               
		     HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		     
		     for (int i = 0; i < ch.length; i++) {
		    	 
		    	  count=0;
		    	 
		    	 for (int j = 0; j < ch.length; j++) {
		    		 
		    		 if(ch[i]==ch[j])
		    		 {
		    			 count++;
		    		 }
					
				}
		    	 
		    	 map.put(ch[i], count);
				
			}
		     
		     System.out.println(map);
		
		
	}

}
