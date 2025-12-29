package interview_Question1;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class Filereader {
	
	public static void main(String[] args) throws Throwable {
		
		File file=new File("C:\\Users\\Sai\\Desktop\\sellenium methods.txt");
		
		FileReader read=new FileReader(file);
		
		char[] ch=new char[(int)file.length()];
		
		     read.read(ch);
		     
           for(char c:ch)
           {
        	   System.out.print(c);
           }
		
		
	}

}
