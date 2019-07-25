package pattern;

public class RemoveDuplicate {
	
	public static void main(String[] args) {
		
		int[] arr= {6,6,8,8,9,10};
		
	
		
		for (int i = 0; i < arr.length; i++) {
			
			boolean flag=true;
			
			for (int j =i+1; j < arr.length; j++) {
				
				
				if(arr[i]==arr[j])
				{
					flag=false;
				}
			}
			
			if(flag==true)
			{
				System.out.println(arr[i]);
			}
			
		}
		
		
	}

}
