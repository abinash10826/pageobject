package assingement;

public class countstring {

	public static void main(String[] args) {
		String str="java";
		int count=0;
		
		int length = 0;
		char[] strCharArray = str.toCharArray();
		for (char c : strCharArray) {
			length++;
		}

		System.out.println(length);
	}

}
