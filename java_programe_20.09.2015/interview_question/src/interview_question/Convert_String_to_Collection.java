package interview_question;

import java.util.ArrayList;
import java.util.List;

public class Convert_String_to_Collection {
	
	public static void main(String[] args) {
		
		String str=" my name is abinash ";
		
		String str1=str.replaceAll(" ", "");
		
		char[] ch=str1.toCharArray();
		
		List<Character> list=new ArrayList<Character>();
		
		for(char result:ch)
		{
			list.add(result);
		}
		
		System.out.println(list);
	}

}
