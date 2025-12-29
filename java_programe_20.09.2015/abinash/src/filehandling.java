import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.Reader;

public class filehandling {
	static int count=1;
	public static void main(String[] args) throws Throwable {
		
		String expresult="krushna";
		
		FileReader file=new FileReader("C:\\Users\\Sai\\Desktop\\New Text Document.txt");
		
		BufferedReader read=new BufferedReader(file);
		
		String s=read.readLine();
		
		
		
		while(s!=null)
		{
			if(s.equals(expresult))
			
				System.out.println(s+" "+count);
			++count;
			s=read.readLine();
		}
		
		
	}

}
