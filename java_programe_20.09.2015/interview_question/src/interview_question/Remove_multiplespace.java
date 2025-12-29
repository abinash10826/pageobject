package interview_question;

public class Remove_multiplespace {
	
	public static void main(String[] args) {
		
		String str=" my  name  is  abinash ";
		
		String str1=str.trim();
		
		System.out.println(str1);
		
		String s="";
		
		for (int i = 0; i < str1.length(); i++) {
			
			if(!(str1.charAt(i)==' ' && str1.charAt(i+1)==' '))
			{
				s=s+str1.charAt(i);
			}
			
		}
		System.out.println(s);
	}

}
