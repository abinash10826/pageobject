package interview_Question1;

public class Findthe_Length_Of_String {
	
	public static void main(String[] args) {
		
		String str="java language";
		
		int length=0;
		
		     String str1=str.replace(" ", "");
		
		int a=str1.length();
		
		System.out.println(a);
		
		for (int i = 0; i <=str1.length()-1; i++) {
			
			length++;
			
		}
		
		System.out.println(length);
		
	}
	
	

	
}
