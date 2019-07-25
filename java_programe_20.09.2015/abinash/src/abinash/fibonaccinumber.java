package abinash;

public class fibonaccinumber {

	public static void main(String[] args) 
	{
		int first=1,second=2,third=3;
		
		System.out.print(first+","+second);
		
		for(int i=3;i<=10;i++)
		{
			third=first+second;
			System.out.print(","+third);
		
			first=second;
			second=third;
			
		
	

	}}

}
