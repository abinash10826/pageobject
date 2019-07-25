package pattern;

public class Pattern12 {
	
	public static void main(String[] args) {
		int n=7;
		int star=1;
		int space=3;
		int m=(n/2+1);
		
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=space;j++)
			{
				System.out.print(" ");
			}
				for(int k=1;k<=star;k++)
				{
					System.out.print(k);
				
				}
			System.out.println();
			if(i<m)
			{
				space--;
				star+=2;
			}
			else
			{
				space++;
				star-=2;
			}
		}
	}

}
