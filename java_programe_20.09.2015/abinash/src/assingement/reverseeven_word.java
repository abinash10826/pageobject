package assingement;

public class reverseeven_word {

	public static void main(String[] args) {
      String str="java is beautiful language";
      String ch[]=str.split(" ");
      String reverse="";
      
      for (int i = 1; i <=ch.length-1; i++) {
    	  
    	  String s=ch[i];
    	  if(i%2==0)
    	  {
    		  for (int j = s.length()-1; j >=0; j--) 
    		  {
    			  
    			  reverse=reverse+s.charAt(j);
    		  }
    		  
    	  }
    	  else
    	  {
    		  reverse=reverse+s;
    		  
    	  }
		reverse=reverse+" ";
		
	}
      System.out.println(ch[0]+" "+reverse);
	}

}
