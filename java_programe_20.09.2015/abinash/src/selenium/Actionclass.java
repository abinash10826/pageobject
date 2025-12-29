package selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Actionclass {
	
	public static void main(String[] args) {
		
WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://sai-pc/login.do");
		
		WebElement wb=driver.findElement(By.name("username"));
		
		     WebDriverWait wait=new WebDriverWait(driver, 20);
		     wait.until(ExpectedConditions.visibilityOf(wb));
		     
		     FluentWait  wait1=new FluentWait(driver);
		     wait1.pollingEvery(5, TimeUnit.SECONDS);
		     wait1.withTimeout(20, TimeUnit.SECONDS);
		     wait1.until(ExpectedConditions.visibilityOf(wb));
		     
		     
		
		wb.sendKeys("abinash");
		
		   Actions act=new Actions(driver);
		   
		   
		        act.doubleClick(wb).perform();
		        
		        act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		        act.sendKeys(Keys.TAB).perform();
		        
		        act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
		        
		        //act.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD)).perform();
		        
		        act.contextClick(wb).sendKeys("A").build().perform();
		
		
	}

}
