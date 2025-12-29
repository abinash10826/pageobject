package mapping_collection;

import java.util.HashMap;
import java.util.LinkedHashMap;

public class occurance_number {

	public static void main(String[] args) {
		String str = "java is java again java again";

		LinkedHashMap<Character, Integer>charCount = new LinkedHashMap<Character, Integer>();

		int count;
		
		String str1=str.replaceAll(" ", "");

		char[] strArray = str1.toCharArray();

		for (int i = 0; i <strArray.length; i++) {
			count = 0;

			for (int j = 0; j <strArray.length; j++) {
				if (strArray[i] == strArray[j]) {
					count++;
				}
			}

			charCount.put(strArray[i], count);
		}

		System.out.println(charCount);
	}
}


	


