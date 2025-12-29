package assingement;

public class count_no_of_digit {

	public static void main(String[] args) {
		String str="java5555";
		int count=0;
		char[] ch=str.toCharArray();
		String s = "";
		for(int i=0;i<=ch.length-1;i++)
		{
			if (ch[i]>=48 && ch[i]<=57)
			{
				count++;
        
	       
        
		}
			
			 
	}
		  System.out.println(count);
}}