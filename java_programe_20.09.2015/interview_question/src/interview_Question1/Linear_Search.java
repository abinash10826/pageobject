package interview_Question1;

public class Linear_Search {
	
	public static int linearSearch(int[] a,int key)
	{
		for (int i = 0; i < a.length; i++) {
			
			if(a[i]==key)
			{
				return i;
			}
			
		
		}
		
		return -1;
		
	}
	
	public static void main(String[] args) {
		
		int[] b= {10,20,30,50,70,90};
		
		int key=100;
		
		int result=linearSearch(b, key);
		
		System.out.println(key +" is found in index :"+result);
		
		
	}

}
