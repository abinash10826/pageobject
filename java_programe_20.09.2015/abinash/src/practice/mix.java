package practice;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class mix {

	public static void main(String[] args) throws IOException {
          
		File f1=new File("D:\\programejava\\demo.txt");
		
		//f1.mkdir();//create folder
		
		f1.createNewFile();//create extension file
		
		FileWriter writer=new FileWriter(f1);
		
		writer.write("welcome to java"+"\r\n");
		writer.write("welcome"+"\r\n");
		writer.write("abinash");
		writer.close();
		
		FileReader reader=new FileReader(f1);
		
		char []ch=new char[(int)f1.length()];
		
		reader.read(ch);
		//for(char c:ch)
		System.out.println(ch);
		
		
		
	}

}
