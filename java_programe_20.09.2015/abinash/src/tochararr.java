
public class tochararr {
	
	public static void main(String[] args) {
		
		String str="abiansh";
		
		String reverse="";
		
		char[] ch=str.toCharArray();
		
		for (int i = ch.length-1; i >= 0; i--) {
			
			reverse=reverse+ch[i];
			
			//System.out.println(reverse);
			
		}
		System.out.println(reverse);
	}

}
