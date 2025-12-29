package com.interview;

public class PrimeNumber {
	
	public static void main(String[] args) {
		
		for (int i = 1; i <=100; i++) {
			
			boolean isprime=true;
			
			for (int j =2; j <i; j++) {
				
				if(i%j==0)
				{
					isprime=false;
				}
				
			}
			
			if(isprime)
			{
				System.out.print(i+" ");
			}
			
		}
	}

}
