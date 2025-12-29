package interview_question;

public class Anothermethod_secondlargestvalue {
	
	
	public static void  getthird(int[] a)
	{
		int temp;
		for (int i = 0; i < a.length; i++) {
			
		for (int j = 1+i; j < a.length; j++) {
			
			if(a[i]>a[j])
			{
				temp=a[i];
				a[i]=a[j];
				a[j]=temp;
				
				//System.out.println(a[i]);
			}
			
			
		}
		System.out.println(a[(a.length-1)-2]);	
		}
	}
	
	public static void main(String[] args) {
		int[] b={2,6,8,9,3,5,4,10,12,42,34,78,98};
		
		getthird(b);
	}

}
