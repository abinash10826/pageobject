package interview_Question1;

public class Find_All_Substring {
	
	public static void main(String[] args) {
		
		String str="abba";
		
		for (int i = 0; i <str.length(); i++) {  
			for (int j = i+1; j <= str.length(); j++) {  
			System.out.println(str.substring(i,j));  
			
			     }  
			    }  

	}

}
