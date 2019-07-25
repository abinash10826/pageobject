package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class yahoo {

	public static void main(String[] args) throws InterruptedException {
		
	
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 //open the yahoo browser
		driver.get("https://in.yahoo.com");
		Thread.sleep(10000);
		
		//identify the element
		
		List<WebElement>  list=driver.findElements(By.xpath("//a"));
		
		System.out.println(list.size());
		
		for(WebElement wen:list)
		{
			String link=wen.getText();
			
			System.err.println(link);
		}
		
		driver.close();
		

          
	}

}
