package interview_Question1;

public class String_Palindrome {
	
	public static void main(String[] args) {
		
		String str="madam";
		
		StringBuffer buff=new StringBuffer(str);
		
		           buff.reverse();
		           
		      //convert Stringbuffer to String
		           
		           String reverse=buff.toString();
		           
		           if(str.equals(reverse))
		           {
		        	   System.out.println("String is pallindrome");
		           }
		           
		           else
		           {
		        	   System.out.println("String is not pallindrome");
		           }
		           
		           
		
	}

}
