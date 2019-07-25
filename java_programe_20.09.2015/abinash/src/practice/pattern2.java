package practice;

public class pattern2 {

	public static void main(String[] args) {
            int n=9;
            int star=5;
            int space=0;
            int m=(n/2+1);
            
            for(int i=1;i<=n;i++)
            {
            	for(int j=1;j<=star;j++)
            	
            		System.out.print("* ");
            		for(int k=1;k<=space;k++)
            		
            			System.out.print(" ");
            		
            	
            	System.out.println();
            	
            	if(i<m)
            	{
            		star--;
                	space++;
            	}
            	else
            	{
            		star++;
            		space--;
            	}
            	
            }
	}

}
