package interview_Question1;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class fibbonacie_odd_no {
	
	public static void main(String[] args) {
		
		
		Scanner scan=new Scanner(System.in);
		
		      int val=scan.nextInt();
		      int val1=scan.nextInt();
	
		int a=0;
		int b=1;
		int c=0;
		ArrayList<Integer> array=new ArrayList<>();
		
		  
		for (int i =2; i <=250; i++) {
			
			c=a+b;
			
	       a=b;
	       b=c;
	       //System.out.print(c +" ");
	       if(c>=val && c<=val1 && c%2!=0)
	       {
	    	   array.add(c);
	    	 
	    	     
	       }
	    

			}
		System.out.print("odd==="+ array.get(array.size()-1));  
		
			
		}
		
		
	}


