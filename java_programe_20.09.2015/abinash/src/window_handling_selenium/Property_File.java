package window_handling_selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Property_File {

	public static void main(String[] args) throws Throwable {
		
		//create java object to physical file using inputstream
		
		FileReader file=new FileReader("./java_library/data.properties");
		
        Properties obj=new Properties();
           obj.load(file);
           
           String URL=obj.getProperty("url");
           System.out.println(URL);
           
           WebDriver driver=new FirefoxDriver();
           
           driver.get(URL);
        
        
	}

}
