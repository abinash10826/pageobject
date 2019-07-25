package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class Drop_down_mousefunction {
          
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.com/");
		
		WebElement dwb=driver.findElement(By.xpath("//span[text()='Departments']"));
		
		// create an object to Action class
		
		Actions act=new Actions(driver);
		
		// take mouse curser on the dropdown menu element & execute actions class method using perform()
		
		         act.moveToElement(dwb).perform();
		         
		         //click on sub-menu
		         
		         driver.findElement(By.xpath("//span[text()='Digital Music']")).click();
		         
		         
		         
		         
		         
		         
		         
		         
		
		
	}
}
