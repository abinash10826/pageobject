package practice;

import java.io.FileWriter;
import java.io.IOException;

public class filewriter {

	public static void main(String[] args) throws IOException {
             
		FileWriter writer=null;
		writer=new FileWriter("D:\\javafile\\demo.txt");
		
		writer.write("hi"+"\r\n");
		writer.write("good morning");
		
		writer.close();
	}

}
