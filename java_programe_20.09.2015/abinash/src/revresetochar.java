
public class revresetochar {
	
	public static void main(String[] args) {
		
        String str="abiansh";
		
		String reverse="";
		
		for (int i = str.length()-1; i>=0; i--) {
			
			char ch=str.charAt(i);
			reverse=reverse+ch;
			
			
		}
		
		System.out.println(reverse);
		System.out.println(str.length());
	}

}
