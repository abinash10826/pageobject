package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Select {
	
	public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebook.com/");
		
	WebElement wb=driver.findElement(By.id("month"));
		
  org.openqa.selenium.support.ui.Select sel=new org.openqa.selenium.support.ui.Select(wb);
  
                     Thread.sleep(2000);
  
                sel.selectByVisibleText("Apr");
                
                sel.deselectByValue("Apr");
		
	}

}
