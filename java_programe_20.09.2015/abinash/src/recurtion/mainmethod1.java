package recurtion;

public class mainmethod1 {
	static int factorial(int n)
	{
		if(n==1)
		{
			return 1;
			
		}
		else
			{
				return factorial(n-1)*n;
			}
		}


	public static void main(String[] args) {
		
		System.out.println(factorial(5));

	}

}
