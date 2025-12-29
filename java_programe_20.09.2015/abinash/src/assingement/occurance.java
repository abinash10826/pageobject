package assingement;

import java.util.Scanner;

public class occurance {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter a word or sentense :");
		String str=scan.nextLine();
		int count=0;
		System.out.println("Enter a letter which occurance you want to show :");
		char oc=scan.next(".").charAt(0);
		char [] ch=str.toCharArray();
		for (int i=0;i<=ch.length-1;i++)
		{
			 i = 0;
			if(ch[i]==oc)
			{
				count++;
				
			}
			else
			{
				continue;
		
		
			}
			
		System.out.println(oc+"has been repeted"+count+"time"+"in"+str);
		}
	}}