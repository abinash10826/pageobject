package assingement;

public class recursionreverse {

	 public String reverseString(String str){
		   
		 
	      if(str.isEmpty()){
	         return str;
	      } else {
	    	  
	         return reverseString(str.substring(1))+str.charAt(0);
	      }
	   }
	   public static void main(String[] args) {
		   recursionreverse obj = new recursionreverse();
	      String result = obj.reverseString("AABBC");
	      System.out.print(result);
	   }
	}