package com.api.project;

public class Amst {
	
	public static void main(String[] args) {
		
     int c=0,a,temp;
     int n=153;
     temp=n;
     
     while(n>0)
     {
    	 a=n%10;
    	 n=n/10;
    	 
    	 c=c+(a*a*a);
     }
     
     if(c==temp)
     {
    	 System.out.println("number is amstrong");
     }
     else
     {
    	 System.out.println("number is not amstrong");
     }

	}

}
