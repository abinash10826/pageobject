package interview_question;

/*
1
2*2
3*3*3
4*4*4*4
4*4*4*4
3*3*3
2*2
1
*/

public class Pattern13 {
	
	
public static void main(String[] args) {
		
		int n=8;
		int mid=(n/2)+1;
		int star=1;
		int space=0;
		
		for (int i = 1; i <=n; i++) {
			
			for (int j = 1; j <=star; j++) {
				
				System.out.print("* ");
					
			}
			
			System.out.println();
			
			if(i<=mid)
			{
				star+=2;;
			}
			else
			{
				star-=2;
			}
			
		}
		
	}


}
