package com.interview;

public class Pattern1 {
	
	public static void main(String[] args) {
		
		int n=7;
		int star=1;
		int mid=n/2+1;
		
		for (int i = 1; i <=n; i++) {
			
			for (int j = 1; j <=star; j++) {
				
				System.out.print("*");
				
			}
			
			System.out.println();
			
			if(i<mid)
			{
				star++;
			}
			else
			{
				star--;
			}
			
		}
	}

}