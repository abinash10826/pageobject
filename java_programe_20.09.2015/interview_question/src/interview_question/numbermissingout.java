package interview_question;

import java.util.ArrayList;
import java.util.List;

public class numbermissingout {
	
	public static void missingno(int[] a,int total)
	{
		List<Integer> list=new ArrayList<Integer>();
		
		for (int i = 0; i <=a.length-1; i++) {
			
			list.add(a[i]);}
			
			while(total>=1)
			{
				if(!list.contains(total))
				{
					System.out.println("missing number==>"+ total);
				}
				
				total--;
			}
			
		
	}
	
	
	public static void main(String[] args) {
		
		missingno(new int[]{4,2,1,3,7,9,6,5,12},11);
		
	}

}
