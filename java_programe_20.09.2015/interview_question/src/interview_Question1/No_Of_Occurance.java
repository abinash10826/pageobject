package interview_Question1;

import java.util.HashMap;

public class No_Of_Occurance {
	
	public static void main(String[] args) {
		
		String str="    My    Name    Is    Abinash  ";
		
		        str=str.replaceAll("\\s+", "");
		        
		        str=str.toLowerCase();
		        
		        int count=0;
		        
		       char[] ch=str.toCharArray();
		        
		        HashMap<Character, Integer> map=new HashMap<Character, Integer>();
		        
		        for (int i = 0; i <ch.length; i++) {
		        	
		        	 count=0;
		        	
					for (int j = 0; j <ch.length; j++) {
						
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
