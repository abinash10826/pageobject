package assingement;

public class reversestring {

	public static void main(String[] args) {
		String str="java";
		String reverse=" ";
		char[] ch=str.toCharArray();
		String s = "";
		for(int i=ch.length-1;i>=0;i--)
		{
			reverse= reverse+ch[i];
			
		
		}
		
		System.out.println(reverse);

	}

}
