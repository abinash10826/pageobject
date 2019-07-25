package com.interview;

import java.io.IOException;

public class Practice  {	
public static void main(String[] args) throws Throwable {
	
	String str="AbhgiONouu";
	
	String str1=str.toLowerCase();
	
	  char[] ch=str1.toCharArray();
	  
	  int count=0;
	  
	  for (int i = 0; i < ch.length; i++) {
		  
		  if(ch[i]=='a' ||ch[i]=='e' || ch[i]=='i' || ch[i]=='o'||ch[i]=='u')
		  {
			  count++;
		  }
		
	}
	  
	
	System.out.println(count);
   }
	}