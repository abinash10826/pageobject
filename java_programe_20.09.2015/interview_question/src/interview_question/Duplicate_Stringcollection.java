package interview_question;

import java.util.HashMap;

public class Duplicate_Stringcollection {
	public static void main(String[] args) {
		
	

	
        String str="my name is abinash";
        		
String str1=str.replaceAll(" ", "");
		
		char[] ch=str1.toCharArray();
		
		HashMap<Character,Integer> map=new HashMap<Character,Integer>();
		
		for (int i = 0; i < ch.length; i++) {
			int count=0;
			for (int j = 1; j < ch.length; j++) {
				
				if(ch[i]==ch[j])
				{
					count++;
					
				}	
				if(count>1)
				{
					map.put(ch[i], count);
				}

        }
			
			
    }
		System.out.println(map);
}
}
