package pattern;

import java.util.Arrays;

public class SortAnArray {
	
	public static void main(String[] args) {
		
		int[] arr= {2,6,8,3,1,10,7,12,9};
		
		for (int i = 0; i < arr.length; i++) {
			
			Arrays.sort(arr);
			
			System.out.println(arr[i]);
			
		}
	}

}
