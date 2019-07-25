package practice;

public class Npattern1 {

	public static void main(String[] args) {
		int n=5;
		int A=1;
        
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
			
				System.out.print((char) (64+ i+j)+" ");
			
			}
			System.out.println();
			
			} 

}}
