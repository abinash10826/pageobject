package Array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class sorting {
	 
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the size");
		int size=scan.nextInt();
		
		//System.out.println(size);
		userInput(size);
		
		

	}
	
	public static void userInput(int size)
	{
		int arr[]=new int[size];
		for (int i = 0; i < size; i++) {
			arr[i]=scan.nextInt();
		}
		sort(arr);
	}
	
      public static void sort(int arr[])
      {
    	  for (int i = 0; i < arr.length-1; i++) {
    		  for (int j = i+1; j < arr.length-1; j++) {
    			  
    			  if(arr[i]>arr[j])
    			  {
    				  int temp=arr[i];
    				  arr[i]=arr[j];
    				  arr[j]=temp;
    				  
    				  
    			  }
    			  
    			  
			}
			
		}
    	  //Arrays.sort(arr);
    	  System.out.println(Arrays.toString(arr));
    	  
      }
}
