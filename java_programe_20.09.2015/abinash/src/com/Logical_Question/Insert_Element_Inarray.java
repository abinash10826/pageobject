package com.Logical_Question;

import java.util.Arrays;

public class Insert_Element_Inarray {
	
	public static void main(String[] args) {
		
	int[] arr={4,6,8,2,9,7,8,34,78,99,16};
	
	int indexposition=4;
	int newelement = 50;
	
	   for(int i=arr.length-1;i>indexposition;i--)
	   {
		   arr[i]=arr[i-1];
		   
	   }
	   
	   arr[indexposition]=newelement;
	   
	   System.out.print(Arrays.toString(arr));

}}
