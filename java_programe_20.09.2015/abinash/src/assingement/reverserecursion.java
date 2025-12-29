package assingement;

public class reverserecursion {
	
	static int i=0;
	static String rev="";
	
	static void reverse(String s)
	{
		if(i<s.length())
		{
			//i++;
			rev=s.charAt(i)+rev;
			i++;
			reverse(s);
		}
		
	}
	public static void main(String[] args) {
     reverse("abinash");
     
     System.out.println(rev);
	}

}
