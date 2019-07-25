package com.api.project;

public class PrimeNumber {
	public static void main(String[] args) {
		
		for(int i=1;i<=100;i++)
		{
			boolean flag=true;
			for(int j=2;j<i;j++)
			{
				if(i%2==0)
				{
					flag=false;
				}
			}
			
			if(flag)
			{
				System.out.println(i);
			}
		}
	}

}
