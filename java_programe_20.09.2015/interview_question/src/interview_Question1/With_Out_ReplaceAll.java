package interview_Question1;

public class With_Out_ReplaceAll {
	
	public static void main(String[] args) {
		
		String str="  java  is  a  beautifull  language  ";
		
	              str=str.trim();
	              
	              System.out.println(str);
	              
	              String s="";
	              
	              for (int i = 0; i <=str.length()-1; i++) {
	            	  
	            	  if(!(str.charAt(i)==' ' && str.charAt(i+1)==' '))
	            		  
	            	  {
	            		  s=s+str.charAt(i);
	            		  
	            	  }
	            	  
					
				}
	              
	              System.out.println(s);
		
	}

}
