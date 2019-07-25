package interview_Question1;

public class Remove_Space_Of_String {
	
	public static void main(String[] args) {
		
		String str="  Core Java jsp servlets             jdbc struts hibernate spring  ";
		
		             
		             
		             
		             System.out.println(str.trim().replaceAll("\\s+", " "));
	}
	
	

}
