package abinash;

public class pattern {

	public static void main(String[] args) {
		int n=5;
		for(int i=1;i<=n;i++)
		{
			for(int j=1;j<=n;j++)
			{
				if(i<=j)
				{
					System.out.print(n-j+i+(" "));
					
				}
				else
				{
					System.out.print(1+(" "));
				}
				
				
			}
			System.out.println();
		}

	}

}
