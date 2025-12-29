package pattern;

/*
A. 

* * * * *
  * * * *
    * * *
      * *
        *  */


public class Pattern1 {
	
	public static void main(String[] args) {
		
		int n=5;
		
		for (int i = 1; i <= n; i++) {
			
			for (int j = 5; j >=1; j--) {
				
				if((i+j)<=(n+1))
				{
					System.out.print("*");
				}
				
				else
				{
					System.out.print(" ");
				}
				
			}
			
			System.out.println();
			
		}
		
	}

}
