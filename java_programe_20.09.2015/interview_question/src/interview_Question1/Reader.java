package interview_Question1;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Reader {
	
	public static void main(String[] args) throws Throwable {
		
	      FileReader fil=new FileReader("C:\\Users\\Sai\\Desktop\\sellenium methods.txt");
	      
	      BufferedReader read=new BufferedReader(fil);
	      
	      String s=read.readLine();
	      
	      while(s!=null)
	      {
	    	  System.out.println(s);
	    	  
	    	  //s=read.readLine();
	      }
	}

}
