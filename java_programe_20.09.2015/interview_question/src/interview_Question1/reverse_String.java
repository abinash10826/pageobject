package interview_Question1;

public class reverse_String {
	
	public static void main(String[] args) {
		
		String str="abinash";
		
		String reverse="";
		
		char[] ch=str.toCharArray();
		
		for (int i =ch.length-1; i >=0; i--) {
			
			reverse=reverse+ch[i];
			
		}
		
		System.out.println(reverse);
	}

}
