package pattern;

import java.util.HashMap;

public class Ocuur {
	
	public static void main(String[] args) {
		
		String str="java is a beautyfull language";
		
		               String str1=str.replaceAll("\\s+", "");
		                      
		                   char ch[]=str1.toCharArray();
		                   int count=0;
		          
		          HashMap<Character, Integer> amp=new HashMap<Character, Integer>();
		          
		          for (int i = 0; i <= ch.length-1; i++) {
		        	  
		        	   count=0;
		        	  
		        	  for (int j = 0; j <=ch.length-1; j++) {
		        		  
		        		  if(ch[i]==ch[j])
		        		  {
		        			  count++;
		        		  }
		        		  	
					}
		        	  
		        	  amp.put(ch[i], count);
					
				}
		          
		          System.out.println(amp);
	}

}
