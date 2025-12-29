package Array;

public class ASCIInumber {

	public static void main(String[] args) {
		char c='@';
		if (c>=65 && c<=90)
		{
			System.out.println("id is upper case");
		}
		else if (c>=97 && c<=122)
		{
			System.out.println("it is lower case");
		}
		else if (c>=48 && c<=57)
		{
			System.out.println("number");
		}
		else {
			System.out.println("special character");
		}

	}

}
