package assingement;

public class stringpalindrom {

	public static void main(String[] args) {
               
		String str="abinash";
		
		StringBuffer buff=new StringBuffer(str);
		
		buff.reverse();
		
		String rev=buff.toString();
		
		if(str.equals(rev))
		{
			System.out.println("palindrom");
		}
		else
		{
			System.out.println("not palindrom");
		}
	}

}
