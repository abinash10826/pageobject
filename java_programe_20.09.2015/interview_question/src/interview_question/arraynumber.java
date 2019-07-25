package interview_question;

import java.util.Arrays;

public class arraynumber {
	
	public static int higest(int[] a,int total)
	{
			
			Arrays.sort(a);
			
			
			return a[total-1];
		
		
	}
	
	public static void main(String[] args) {
		
		int secondvalue=higest(new int[]{2,7,8,4,76,98,45,67},7);
		
		System.out.println(secondvalue);
		
		
		
	}

}
