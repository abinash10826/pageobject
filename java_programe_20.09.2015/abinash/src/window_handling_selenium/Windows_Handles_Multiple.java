package window_handling_selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Windows_Handles_Multiple {
	

      @Test
      
      public void windowcontrolTest()
      {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//navigate url

		driver.get("https://www.flipkart.com/");
		
		//search for the product in main window
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iPhone",Keys.ENTER);
		
		//get scroll bar down
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,200)");
		

		//click on iphone link its open child window
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone SE (Gold, 32 GB)']")).click();
		//driver.findElement(By.xpath("//div[text()='Apple iPhone SE (Space Grey, 32 GB)']")).click();
		
		
		
		//get all window session id
		String child1="Apple iPhone SE (Gold, 32 GB)";
		String parent=driver.getWindowHandle();
		Set<String> set=driver.getWindowHandles();
		
		Iterator<String> it=set.iterator();
		
		for (int i = 0; i <set.size(); i++) {
			
			driver.switchTo().window(it.next());
			
			if(driver.getTitle().equals(child1))
			{
				   
			       //perform on action in childwindow
			 		
			 		driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
			 		
			 		//close the child window
			 		
			 		driver.close();
			 		
			 		break;
			}
			
		}
         
         
        
        
         
       
 		//close the child window
 		
 		driver.close();
 		
 		//pass driver control back to parent window
 		
 		driver.switchTo().window(parent);
 		
 		driver.close();
 		
		
		
	}}


