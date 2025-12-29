package interview_Question1;

import java.util.Scanner;

public class Moolya {
	
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		           int val=scan.nextInt();
		           int val1=scan.nextInt();
		
		for (int i=val; i <=val1; i++) {
			
			if(i%3==0)
			{
				System.out.println("CLOUD");
			}
			
			else if(i%7==0)
			{
				System.out.println("NIX");
			}
			
			else if(i%3==0 && i%7==0)
			{
				System.out.println("CLOUDNIX");
			}
			
			else
			{
				System.out.println(i);
			}
			
		}
		System.out.println("-------------");
		int val2=scan.nextInt();
        int val3=scan.nextInt();
		
for (int i=val2; i <=val3; i++) {
			
			if(i%3==0)
			{
				System.out.println("CLOUD");
			}
			
			else if(i%7==0)
			{
				System.out.println("NIX");
			}
			
			else if(i%3==0 && i%7==0)
			{
				System.out.println("CLOUDNIX");
			}
			
			else
			{
				System.out.println(i);
			}
			
		}
		
	}

}
