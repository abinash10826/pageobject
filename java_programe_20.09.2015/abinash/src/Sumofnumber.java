import java.util.Scanner;

public class Sumofnumber
{

	public static void main(String[] args) 
	{
		
		Scanner scan=new Scanner(System.in);
		System.out.println("enter number");
		int num=scan.nextInt();
		main1 no=new main1();
		int result=no.sapnum(num);
		
		
		System.out.println(result);

	}

}

class main1
{
	
	 static  int sapnum(int num)
	{
     int sum=0;
	
	while(num>0)
	{
		
	int rem=num%10;
	sum=sum+rem;
	num=num/10;
	}
	return sum;
	
	
	}}
	

