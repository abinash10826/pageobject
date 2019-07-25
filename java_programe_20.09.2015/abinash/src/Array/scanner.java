package Array;

import java.util.Arrays;
import java.util.Scanner;

public class scanner {
	static Scanner scan=new Scanner(System.in);
	
	public static void main(String[] args) {
		
	
		System.out.println("enter the size of array");
		
		int size=scan.nextInt();
		int arr[]=new int[size];
		//int arr2[]=new int[size];
		//System.out.println(size);
		sort(arr);
		sorting(arr);
		
		
		//print(arr);
		
	}
		public static void sort(int arr[])
		{
		System.out.println("enter element");
		
		for(int i=0;i<arr.length;i++)
		{
			arr[i]=scan.nextInt();
			
		}
		
		
}
		   public static void sorting(int arr[])
		      {
		    	  for (int i = 0; i < arr.length-1; i++) {
		    		  for (int j = i+1; j < arr.length-1; j++) {
		    			  
		    			  if(arr[i]>arr[j])
		    			  {
		    				  int temp=0;
		    				  temp=arr[i];
		    				  arr[i]=arr[j];
		    				  arr[j]=temp;

		    		  }
		    	  }
		      }
		    	  System.out.println(Arrays.toString(arr));
}
}