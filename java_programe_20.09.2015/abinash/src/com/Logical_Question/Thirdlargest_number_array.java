package com.Logical_Question;

import java.util.Arrays;

public class Thirdlargest_number_array {
	
	
	public static int  getthird(int[] a,int total)
	{
		Arrays.sort(a);
		return a[total-3];
	}
	
	public static void main(String[] args) {
		
		
       int[] a={2,6,8,9,3,1,7};
       
      System.out.println(getthird(a,7));

	}

}
