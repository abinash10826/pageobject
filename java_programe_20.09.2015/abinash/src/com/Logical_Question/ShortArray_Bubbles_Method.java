package com.Logical_Question;

public class ShortArray_Bubbles_Method {
	
	public static void main(String[] args) {
		
		int[] number={2,8,5,1,9,8,6,11,45,67,34};
		
		int temp=0;
		
		for (int i = 0; i < number.length; i++) {
			
			for (int j = 1+i; j < number.length; j++) {
				
				if(number[i]>=number[j])
				{
					temp=number[i];
					number[i]=number[j];
					number[j]=temp;
				
				}
				
				
			}
			System.out.print(","+number[i]);
			
		}
		
	}

}
