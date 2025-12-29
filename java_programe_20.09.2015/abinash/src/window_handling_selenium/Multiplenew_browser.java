package window_handling_selenium;

import java.util.ArrayList;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Multiplenew_browser {
	
	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new FirefoxDriver();
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		 
		 //navigate the url
		 
		 driver.get("https://www.flipkart.com/");
		 
		//search for the product in main window
			
			driver.findElement(By.xpath("//button[text()='✕']")).click();
			
			driver.findElement(By.name("q")).sendKeys("iPhone",Keys.ENTER);
			
			//get scroll bar down
			
			JavascriptExecutor js=(JavascriptExecutor)driver;
			
			js.executeScript("window.scrollBy(0,300)");
			
			////click on iphone link its open child window 
			
			driver.findElement(By.xpath("//div[text()='Apple iPhone SE (Gold, 32 GB)']")).click();
			
			driver.findElement(By.xpath("//div[text()='Apple iPhone SE (Space Grey, 32 GB)']")).click();
			
			/*String child1="Apple iPhone SE (Gold, 32 GB)";
			String child2="Apple iPhone SE (Space Grey, 32 GB)";*/
			String parentid=driver.getWindowHandle();
			
			Set<String> set=driver.getWindowHandles();
			 
			ArrayList<String> list=new ArrayList<>(set);
			
			System.out.println(list);
			driver.switchTo().window(list.get(1));
			
			//perform on action in childwindow
			
			driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
			
			//close only child window
			driver.close();
			
			//pass driver control back to parent window
			driver.switchTo().window(list.get(0));
			
			driver.switchTo().window(list.get(2));
			
//perform on action in childwindow
			
			driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
			
			//close only child window
			driver.close();
			
			//pass driver control back to parent window
			driver.switchTo().window(list.get(0));
			
	}

}
