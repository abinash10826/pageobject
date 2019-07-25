package interview_question;

import java.util.Arrays;
import java.util.List;

public class Another_String_To_Collection {
	
	public static void main(String[] args) {
		
		try
		{
			
		
		
		String[] str={"abiansh","pintu","java","python","sql","automation","selenium"};
		
		List<String> list=Arrays.asList(str);
		
		System.out.println(list);
		
		}
		catch (Exception e) {
			
			System.out.println("hi");
		}
	}

}
