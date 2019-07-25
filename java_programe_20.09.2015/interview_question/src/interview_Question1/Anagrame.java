package interview_Question1;

import java.util.Arrays;

public class Anagrame {
	
	public static void main(String[] args) {
		
		String s1 = "cat";
	    String s2 = "tac";
	    boolean isAnagrame=false;
	    
	    if(s1.length()==s2.length())
	    {
	    	char[] ch=s1.toCharArray();
	    	char[] ch1=s2.toCharArray();
	    	
	    	Arrays.sort(ch);
	    	Arrays.sort(ch1);
	    	
	    	System.out.println(isAnagrame=Arrays.equals(ch, ch1));
	    }
	    else
	    {
	    	System.out.println("not anagrame");
	    }

	}

}
