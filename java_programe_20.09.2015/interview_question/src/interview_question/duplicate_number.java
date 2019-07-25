package interview_question;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.TreeSet;

public class duplicate_number {
	
	private duplicate_number()
	{
		
	}
	
	public static void main(String[] args) {
		
	
	
	int[] arr=new int[]{2,7,8,9,9,4,3,3};
	
	

    TreeSet<Integer> unique = new TreeSet<Integer>();
    for (int i = 0; i < arr.length; i++) {
    	unique.add(arr[i]);
	}
          
	    System.out.println(unique);
	    
	    System.out.println(System.getProperty("user.dir"));
	    
	    
    
    

}}
