package ArraysQuestion;

import java.util.ArrayList;
import java.util.List;

public class missingnumber {
	
	public static void missingnumber(int[] a,int total)
	{
		List<Integer> list=new ArrayList<Integer>();
		
		for (int j = 0; j < a.length; j++) {
			
			list.add(a[j]);	
		}
		
		while(total>1)
		{
			if(!list.contains(total))
			{
				System.out.println("missing number==>"+total);
			}
			
			total--;
		}
		
		
		
	}
	
	public static void main(String[] args) {
		
		int[] b={2,7,4,3,8,9,7,1,5};
		
		missingnumber(b, 9);
		
	}

}
