package pattern;
/*
12344321
123**321
12****21
1******1
*/


public class Pattern11 {
	public static void main(String[] args) {
		
	

	
    int N=8;
	int n=4;
	int x=n;
	
	
	
	for (int i = n; i >=1; i--) {
		
		int y=0;
		for (int j = 1; j <=N; j++) {
			
			
			
				if(j<=x)
				{
				System.out.print(j);
				}
				else if(j>2*n-x)
				{
					System.out.print(x-y);
					y++;
				}
				else
				{
					System.out.print("*");
				}
				
			
			
		}
		    x--;
		System.out.println();
		
	
	
	}}
}
