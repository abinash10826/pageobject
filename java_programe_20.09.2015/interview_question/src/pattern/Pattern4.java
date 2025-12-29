package pattern;




/*
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

public class Pattern4 {
	
	public static void main(String[] args) {
		
		int n=5;
		int N=1;
		
		
		
		for (int i = 1; i <=n; i++) {
			
			for (int j = 1; j <=n; j++) {
				
				if(i>=j)
				{
					System.out.print(N+" ");
					
					N++;
				}
				
			}
			
			System.out.println();
			
		}
		
	}

}
