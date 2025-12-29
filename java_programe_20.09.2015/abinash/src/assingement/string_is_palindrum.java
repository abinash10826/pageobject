package assingement;

public class string_is_palindrum {
	

	public static void main(String[] args) {
		String str="121";
		String reverse="";
		char[] ch=str.toCharArray();
		
		for(int i=ch.length-1;i>=0;i--)
		{
			reverse= reverse+ch[i];
			
		
		}
		
		System.out.println("rev"+reverse);
		if(reverse.equals(str))
		{
		
		System.out.println("string is palindrom");

	}
		else
		{
			System.out.println("string is not palindrom");
		}

}

}
