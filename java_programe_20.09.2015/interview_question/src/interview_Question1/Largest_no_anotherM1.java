package interview_Question1;

import java.util.Arrays;

public class Largest_no_anotherM1 {
	
	public static int largestNo(int[] a,int total)
	{
		Arrays.sort(a);
		
		return a[total-1];
	}
	
	
	public static void main(String[] args) {
		
		int[] b= {78, 83, 20, 30, 22, 11,95};
		
		int Largest=largestNo(b, 7);
		
		System.out.println(Largest);
		
	}

}
