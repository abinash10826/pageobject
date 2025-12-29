package practice;

import java.io.File;
import java.io.IOException;

public class createfile {

	public static void main(String[] args) throws IOException {
          
		File f1=new File("D:\\rr\\ff.pdf");
		if(!f1.exists())
		{
			f1.createNewFile();
		}
		else
		{
			System.out.println(f1.length());
		}
	}

}
