package interview_Question1;

public class Find_Common_Element {
	
	public static void main(String[] args) {
		
		String[] strArray = { "abc", "def", "mno", "xyz", "pqr", "xyz","xyz","mno","mno","mno","pqr" };
		int count=0;
		
		for (int i = 0; i < strArray.length; i++) {
			
			count=0;
			
			for (int j =1+i; j < strArray.length; j++) {
				
				if(strArray[i].equals(strArray[j]) && i!=j)
				{
					
					count++;
					
					
				}
				
			}
			if(count==1)
			{
				System.out.println(strArray[i]);
			}
		}
		
		
	}

}
