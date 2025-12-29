package pattern;


/*

    1    
   2 2   
  3 3 3  
 4 4 4 4 
5 5 5 5 5


*/

public class Pattern5 {
	
	public static void main(String[] args) {
		
		int n=5;
		int star=1;
		int space=4;
        
		for (int i = 1; i <=n; i++) {
			
			for (int j = 1; j <=space; j++) {
				
				System.out.print(" ");
			}
				
				for (int k = 1; k <=star; k++) {
					
				
				System.out.print(i+" ");
				
				}
				
			System.out.println();
			space--;
			star++;
			
			
		}
		
	}

}
