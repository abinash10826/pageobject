package pattern;

import interview_question.Mainmethod;

/*
11111
1   1
1   1
1   1
11111

*/
public class Pattern14 {
	
	public static void main(String[] args) {
		
		int n=5;
        
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(j==1||j==n||(i==1)||(i==n))
				{
					System.out.print("1");
				}
				else
				{
					System.out.print(" ");
				}
			}
			System.out.println();
		}}

}
