package window_handling_selenium;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class NewBrowser_Window {
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//navigate the flipkart window
		
		driver.get("https://www.flipkart.com/");
		
		//search for the product in main window
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		driver.findElement(By.name("q")).sendKeys("iPhone",Keys.ENTER);
		
		//get scroll bar down
		
		/*Actions act=new Actions(driver);
		
		act.sendKeys(Keys.PAGE_DOWN).perform();*/
		
		JavascriptExecutor scroll=(JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,500)");
		
		//click on iphone link its open child window
		
		driver.findElement(By.xpath("//div[text()='Apple iPhone SE (Gold, 32 GB)']")).click();
		
		
		//get all window session id
		
		Set<String> set=driver.getWindowHandles();
		//capture the session id
		
		
		
		Iterator<String> it=set.iterator();
		
		String parentwin=it.next();
		String childwin=it.next();
		
	
		
		//pass the driver control to child window
		
		driver.switchTo().window(childwin);
		
		//perform on action in childwindow
		
		driver.findElement(By.xpath("//button[text()='BUY NOW']")).click();
		
		//close only child window
		driver.close();
		
		//pass driver control back to parent window
		driver.switchTo().window(parentwin);
		
		
	}

}
