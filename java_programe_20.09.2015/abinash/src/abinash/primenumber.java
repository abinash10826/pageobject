package abinash;

public class primenumber {

	public static void main(String[] args) {
		int n=5;
		int m=1;
		for(int i=2;i>=n/2;i++)
		{
			if(n%i==0)
			{
				System.out.println("not prime number");
			}
			else
			{
				System.out.println(" prime number");
				break;
			}
		}

	}

}
