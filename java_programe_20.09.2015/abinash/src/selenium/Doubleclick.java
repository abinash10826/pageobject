package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Doubleclick {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("http://sai-pc/login.do");
		
		WebElement wwb=driver.findElement(By.name("username"));
		
		wwb.sendKeys("admin");
		
		Actions act=new Actions(driver);
		
		act.doubleClick(wwb).perform();
		
		//control+c
		
		act.sendKeys(Keys.chord(Keys.CONTROL,"c")).perform();
		
		//tab
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.TAB).perform();
		//control+c
		
		Thread.sleep(2000);
		act.sendKeys(Keys.chord(Keys.CONTROL,"v")).perform();
		
		Thread.sleep(2000);
	//zoom in and out
		act.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD)).perform();
		act.sendKeys(Keys.chord(Keys.CONTROL,Keys.ADD)).perform();
		
		
		
		
		
	}

}
