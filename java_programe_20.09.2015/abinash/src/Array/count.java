package Array;

import java.util.Arrays;
import java.util.Scanner;

public class count {
	static Scanner scan=new Scanner(System.in);

	public static void main(String[] args) {
		System.out.println("enter the size of character");
		
		int size=scan.nextInt();
		char arr[]=new char[size];
		
		
		
		for(int i=0;i<size;i++)
		{
			char ch=scan.next().charAt(0);
			arr[i]=ch;
		}
		
				main(arr);

	}

	
	public static void main(char arr[])
	{
		int upper=0;
		int lower=0;
		int number=0;
		int special=0;
		for(int i = 0; i < arr.length; i++)
		{
			char ch=arr[i];
			
			if (ch>=65 && ch<=90)
			{
				
				upper++;
				System.out.println("upper"+upper);
			}
			else if (ch>=97 && ch<=122)
			{
			
				lower++;
				System.out.println("lower"+lower);
			}
			else if (ch>=48 && ch<=57)
			{
				
				number++;
				System.out.println("number"+number);
			}
			else {
				
				special++;
				System.out.println("special"+special);
				
				
				
				
			
		}
	}
		 System.out.println(Arrays.toString(arr));
		 
	}}
