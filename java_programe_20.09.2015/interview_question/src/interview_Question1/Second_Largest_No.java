package interview_Question1;

public class Second_Largest_No {
	
	public static void main(String[] args) {
		
		int k[] = { 78, 83, 20, 30, 22, 11,92,94,95 };
		
		int Largest=k[0];
		int SecondLargest=k[0];
		
		for (int i = 0; i < k.length; i++) {
			
			if(k[i]>Largest)
			{
				SecondLargest=Largest;
				Largest=k[i];
			}
			/*else if(k[i]>SecondLargest)
			{
				SecondLargest=k[i];
				
			}
			*/
		}
		
		System.out.println(SecondLargest);
	}

}
