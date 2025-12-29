package Exception;

public class Throwtest {
	
	static void main(int age)
	{
		if(age>=18)
		{
			System.out.println("eligible for vote");
		}
		else
		{
			throw new ArrayIndexOutOfBoundsException("not eligible for vote");
		}
	}

	public static void main(String[] args) {
		
		main(20);
 
	}

}
