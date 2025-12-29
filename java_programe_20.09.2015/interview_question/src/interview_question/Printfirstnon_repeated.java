package interview_question;

public class Printfirstnon_repeated {
	
	public static void main(String[] args) {
		
	String str="abinbiash";
	char[] ch=str.toCharArray();
	
	boolean found=false;
	
	for (int i = 0; i < ch.length-1; i++) {
		   found=true;
		for (int j =1+i; j < ch.length-1; j++) {
			
			if((ch[i]==ch[j]))
			{
				found=false;
				
				break;
				
				
				
			}
			
			
			
		}
		
		if(found)
		{
			System.out.println(ch[i]);
			
			break;
		}
		
	}
	
	   
	

}}
