package pattern;


/*

        1    
      1 2 3
    1 2 3 4 5
  1 2 3 4 5 6 7
1 2 3 4 5 6 7 8 9

*/
public class Pattern7 {
	
	public static void main(String[] args) {
		
		
		int n=5;
		int space=4;
		int star=1;
		
		for (int i = 1; i <=n; i++) {
			
			for (int j = 1; j <=space; j++) {
				
				System.out.print(" ");
				
			}
			
			for (int k = 1; k <=star; k++) {
				
				System.out.print(k);
				
			}
			
			System.out.println();
			
			space--;
			star+=2;
			
		}
		
	}

}
