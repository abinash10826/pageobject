package pattern;

import java.util.HashSet;

public class RemoveduplicateNo {
	
	public static void main(String[] args) {
		
		
		int[] arr= {2,6,8,3,1,10,7,12,9,9,2,2,2,10,12};
		
		HashSet<Integer> set=new HashSet<Integer>();
		
		for (int i = 0; i < arr.length; i++) {
			
			set.add(arr[i]);
			
		}
		
		System.out.println(set);
		
		
	
	}

}
