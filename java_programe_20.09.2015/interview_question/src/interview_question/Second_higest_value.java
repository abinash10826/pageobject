package interview_question;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Second_higest_value {
	
	public static int Secondvalue(int[] a,int total)
	{
		Arrays.sort(a);
		return a[total-2];
	}
	
	public static void main(String[] args) {
		 
		int[] b={2,6,8,1,5,9,12,78,34};
		
		int secondvalue=Secondvalue(b,9);
		
		System.out.println(secondvalue);
	}

}
