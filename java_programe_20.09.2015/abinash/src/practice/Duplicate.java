package practice;

public class Duplicate {

	public static void main(String[] args) {
                
		int[] a= {2,5,7,6,4,8,3,2,8,5,2};
		
		
		int j;
		
		for (int i = 0; i <a.length; i++) {
			    boolean dup=false;
			for ( j =i+1; j < a.length; j++) {
				
				if(a[j]==a[i]) //&& a[i]!=a[j])
				{
					dup=true;
				}
				}
				if(dup==true)
				{
					//System.out.print(a[i]+", ");
				}
				else
				{
					System.out.print(a[i]+" ");
				}
			}
			
		}
	}


