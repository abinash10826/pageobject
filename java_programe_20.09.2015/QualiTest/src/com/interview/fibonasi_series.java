package com.interview;

public class fibonasi_series {
	
	public static void main(String[] args) {
		
		int first=0;
		int second=1;
		int third=0;
		
		System.out.print(first+","+second);
		
		for (int i = 3; i <11; i++) {
			
			third=first+second;
			
			System.out.print(","+third);
			
			first=second;
			second=third;
			
		}
	}

}
