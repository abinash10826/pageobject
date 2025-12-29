package pattern;

/*
11111
2222
333
44
5
*/

public class Pattern8 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for (int i = 1; i <=n; i++) {
			
			for (int j =n; j >=1; j--) {
				
				if((i+j)<=(n+1))
				{
				
				System.out.print(i);
				}
				
			}
			
			System.out.println();
			
		}
		
	}
	



}
