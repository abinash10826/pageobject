package pattern;

/*
 
*
* *
* * *
* * * *
* * * * *
* * * *
* * *
* *
*

*/



public class Pattern3 {
	
	public static void main(String[] args) {
		
		int n=9;
		int mid=(n/2)+1;
		int star=1;
		int space=0;
		
		for (int i = 1; i <=n; i++) {
			
			for (int j = 1; j <=star; j++) {
				
				System.out.print("* ");
					
			}
			
			System.out.println();
			
			if(i<mid)
			{
				star++;
			}
			else
			{
				star--;
			}
			
		}
		
	}

}
