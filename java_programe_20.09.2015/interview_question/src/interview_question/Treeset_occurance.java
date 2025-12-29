package interview_question;

import java.util.ArrayList;
import java.util.Collections;
import java.util.TreeSet;

public class Treeset_occurance {
	
	public static void main(String[] args) {
		
		String str="abiansh";
		
		char[] ch=str.toCharArray();
		
		ArrayList<Character> tree=new ArrayList<Character>();
		
		for (int i = 0; i < ch.length-1; i++) {
			
			for (int j = 0; j < ch.length-1; j++) {
				
				if(ch[i]==ch[j])
				{
					tree.add(ch[i]);
					
				}
				
			}
			
		
		}
		
		for(Character o:tree)
		{
			System.out.println(Collections.frequency(tree, o));
			
		}
	}

}
