package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class singleselect {

	public static void main(String[] args) throws InterruptedException {
              
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://localhost/login.do");
		
		//login to app
		
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("pwd")).sendKeys("manager");
		driver.findElement(By.id("loginButton")).click();
		
		//enter in setting
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[@class='popup_menu_button popup_menu_button_settings']")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//div[text()='Manage system settings & configure actiTIME']")).click();
		
		
		//identify the scroll button
		
		WebElement swb=driver.findElement(By.name("firstHierarchyLevelCode"));
		            
		    
		    Select sel=new Select(swb);
		    
		    sel.selectByVisibleText("Client");
		    
		  
	}

}
