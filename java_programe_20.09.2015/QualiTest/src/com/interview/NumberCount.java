package com.interview;

public class NumberCount {
	
	public static void main(String[] args) {
		
		String str="ahs68@$#!^%&";
		
		int count=0;
		
		 char[] ch=str.toCharArray();
		 
		 for (int i = 0; i < ch.length; i++) {
			 
			 if(!(ch[i]>=48 && ch[i]<=56 || ch[i]>=65 && ch[i]<=90 || ch[i]>=97 && ch[i]<=122))
			 {
				 count++;
			 }
			
		}
		 
		 System.out.println(count);
	}

}
