package com.Logical_Question;

import java.util.Arrays;

/*How to sort an array and search an element inside it?*/

public class Short_Anarray {
	
	public static void main(String[] args) {
		
		int[] number={2,8,5,1,9,8,6,11,45,67,34};
		
		int search=Arrays.binarySearch(number, 8);
		
		System.out.println("found 8 @ "+search);
		
		for (int i = 0; i < number.length; i++) {
			
			Arrays.sort(number);
			
			System.out.print(number[i]+",");
			
		}
		
		
		
		
	}

}
