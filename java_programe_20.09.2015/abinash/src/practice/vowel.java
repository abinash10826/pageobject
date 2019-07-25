package practice;

public class vowel {

	public static void main(String[] args) {

		
		String str = "RemoveVowels";
        String resustr = str.replaceAll("[aeiouAEIOU]", "");
        System.out.println(resustr);
 

	}

}
