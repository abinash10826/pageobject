import java.util.Scanner;

public class numberreverse {

	public static void main(String[] args) 
	{
		Scanner scan1=new Scanner(System.in);
		System.out.println("type a number");
		int num=scan1.nextInt();
		subclass no1=new subclass();
		int result=no1.reverse(num);
		System.out.println(result);

	}

}
class subclass
{
	int reverse(int num)
	{
		int rev=0;
		while(num>0)
		{
		int	rem=num%10;
		rev=(rev*10)+rem;
		num=num/10;
		}
		return rev;
		
		
			
		
		
	}
}

