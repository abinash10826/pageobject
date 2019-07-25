package practice;

public class pattern4 {

	public static void main(String[] args) {
		int n=5;
	    int star=10;
	    int x=n;
	    for(int i=1;i<=n;i++)
	    {
	    	for(int j=1;j<=star;j++)
	    	{
	    		if(j<=x || j>star-x)
	    		{
	    			System.out.print("*");
	    		}
	    		else
	    		{
	    			System.out.print(" ");
	    		}
	    	}
	    	x--;
	    	System.out.println();
	    }

	}

}
