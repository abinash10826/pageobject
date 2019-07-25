package interview_question;

public class Count_vowel_consonent {
	
	public static void main(String[] args) {
		
		String str="Orangea";
		
		str=str.toLowerCase();
		
		int vowel=0;
		int consonants=0;
		
		for (int i = 0; i <str.length(); i++) {
			
			char ch=str.charAt(i);
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u')
			{
				vowel++;
			}
			else if(ch>='a' && ch<='z')
			{
				consonants++;
			}
			
			
		}
		
		System.out.print("vowel "+ vowel+",");
		System.out.print("consonants "+ consonants);
		
	}

}
