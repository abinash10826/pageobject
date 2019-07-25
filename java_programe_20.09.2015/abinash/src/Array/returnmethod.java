package Array;

public class returnmethod {
	
	
	static int[] main()
	{
		return new int[] {10,5,7,8};
	}

	public static void main(String[] args) {
		 
		int ref[]=main();
		
		for(int i=0;i<=ref.length-1;i++)
		{
			System.out.println(ref[i]);
		}

	}

}
