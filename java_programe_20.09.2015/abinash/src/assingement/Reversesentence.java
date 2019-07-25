package assingement;

public class Reversesentence {
	public static void main(String[] args) {
		String str="my name is abinash";
		
		
		
		String reverse="";
		
        String arr[] =str.split(" ");
         
         for (int i = 0; i<arr.length; i++) {
        	 
        	 String s=arr[i];
        	 
        	 
        	 
        	for (int k = s.length()-1; k >=0; k--) {
        		
        		char ch=s.charAt(k);
        		
        		reverse=reverse+ch;
        		
				
			}
        	 
        	reverse=reverse+" ";
			
		}
		
         System.out.println(reverse);
	}

}
