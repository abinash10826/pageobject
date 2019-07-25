package com.interview;

import java.util.HashMap;

public class No_of_occurance {
	public static void main(String[] args) {
		
		String str="my name is abinash";
		
		String str1=str.replace(" ", "");
		
		         char[] ch=str1.toCharArray();
		int count=0;
		
		HashMap<Character, Integer> map=new HashMap<Character,Integer>();
		
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
