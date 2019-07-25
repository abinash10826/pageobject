import java.util.Scanner;

public class ReverseOfaNumber {
	public static void main(String[] args)
	{
		System.out.println("enter the number");
		Scanner sc=new Scanner(System.in);
		int no=sc.nextInt();
		int n=reverse(no);
		//if(n==no){
			System.out.println(n);}
		//else{System.out.println("Not Pallendrome");}
	
	public static int reverse(int num)
	{
		int rev=0;
		while (num>0){
			rev=rev*10+num%10;
			num=num/10;
		}
		return rev;
	}

}
