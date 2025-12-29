package interview_question;

public class Lenth_Of_String {
	
	public static void main(String[] args) {
		
		String str="abinash10826";
		int count=0;
		char[] ch=str.toCharArray();
		
		for(char result:ch)
		{
			count++;
		}
		
		System.out.println(count);
		
		/*or another method*/
		
		int count1=str.lastIndexOf("");
		
		System.out.println(count1);
	}

}
