package Stringmethod;

import inbuildmethod.character;

public class Sum_ofnumberinString {
	public static void main(String[] args) {
		
	
	
	String str=" 12@&!dgv@fjA12561 ";
	
	String[] str1=str.trim().split("[a-zA-Z]+");
	int val=0;
	int d=0;
	int sum=0;
	
	   /*for(String st:str1)
	   {
		 System.out.println(st);  
	   }
	   */
	 //or
	   for (int i = 0; i < str.length()-1; i++) {
		   char ch=str.charAt(i);
		   if(Character.isDigit(ch))
		   {
			    d=Character.getNumericValue(ch);
			    //System.out.println(d);
			    val=val+d;
			    
			    
		   }
		   
		       
	}
   System.out.println(val);  
}}
