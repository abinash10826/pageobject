package interview_question;

public class reverseRecursion {
	static int i;
	static String rev="";
	public static void reverse(String s)
	{
		if(i<s.length())
		{
			
			
			
			rev=s.charAt(i)+rev;
			i++;
			
			reverse(s);
			
		}
		
		 
	}

	
	public static void main(String[] args) {
		reverse("abinash");
		
		System.out.println(rev);
	}}


