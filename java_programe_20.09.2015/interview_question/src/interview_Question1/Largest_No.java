package interview_Question1;

public class Largest_No {
	
	public static void main(String[] args) {
		
		int k[] = { 78, 83, 20, 30, 22, 11,95 };
		
		int Largest=k[0];
		
		for (int i = 0; i < k.length; i++) {
			
			if(k[i]>Largest)
			{
				Largest=k[i];
				
				
			}
			
			
			
		}
		
		System.out.println(Largest);
	}

}
