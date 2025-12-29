package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class filereader {

	public static void main(String[] args) throws IOException {
		
		File f1=new File("D:\\javafile\\demo.txt");
            
		FileReader reader=new FileReader(f1);
		BufferedReader ref=new BufferedReader(reader);
		
		String s=ref.readLine();
		
		ArrayList<String> line=new ArrayList<>();
	
		while(s!=null)
		{
			//for(char c:ch);
			
			
			line.add(s);
			s=ref.readLine();
			//reader.close();
			
		}
		
		System.out.println(line.toString());
		
		for (int i = 0; i < line.size(); i++) {
			
			System.out.println(line.get(i));
		}
		
		
		
		
	}

}
