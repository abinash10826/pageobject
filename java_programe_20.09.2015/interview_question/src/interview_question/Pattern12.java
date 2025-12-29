package interview_question;

/*
1
21
321
4321
54321

*/

public class Pattern12 {
	
	public static void main(String[] args) {
		
		int n=5;
		int k=0;
		
		for (int i = 1; i <=n; i++) {
			k++;
			for (int j = k; j >=1; j--) {
				
				if(i>=j)
				{
					System.out.print(j+" ");
					
				}
				
			}
			
			System.out.println();
			
		}
		
	}

}
