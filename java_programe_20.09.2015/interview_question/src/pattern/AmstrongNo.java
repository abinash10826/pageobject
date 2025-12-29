package pattern;

public class AmstrongNo {
	
	public static void main(String[] args) {
		
		int c=0,a;
		int n=153;
		int temp=n;
		
		while(n>0)
		{
			a=n%10;
			n=n/10;
			c=c+(a*a*a);
			
		}
		

		if(temp==c)
		{
			System.out.println("amstrong number");
		}
		else
		{
			System.out.println("Not amstrong no");
		}
	}

}
