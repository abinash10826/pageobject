package pattern;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Practice {
	
	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		WebElement wb=driver.findElement(By.xpath(""));
		
		WebDriverWait wait=new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.visibilityOf(wb));
		
		//fluent wait
		
		FluentWait wait1=new FluentWait(driver);
		
		wait1.pollingEvery(5, TimeUnit.SECONDS);
		wait1.withTimeout(20, TimeUnit.SECONDS);
		
		driver.switchTo().alert();
		
		
		
		
		Actions act=new Actions(driver);
		
	
	}

}
