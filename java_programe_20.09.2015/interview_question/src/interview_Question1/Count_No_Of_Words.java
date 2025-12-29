package interview_Question1;

public class Count_No_Of_Words {
	
	public static void main(String[] args) {
		
		String str=" my name is abinash ";
		
		      String[] str1=str.trim().split(" ");  
		      System.out.println("no of words= " +str1.length);
		      
		      int count=0;
		      for(String st:str1)
		      {
		    	 char[] cc=st.toCharArray();
		    	 for (int i = 0; i < cc.length; i++) {
		    		 
		    		 count++;
					
				}
		    	 
		      }
		      
		      
		      System.out.println(count);
		
	}

}
