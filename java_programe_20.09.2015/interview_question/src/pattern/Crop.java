package pattern;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Crop {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		
		WebElement wb=driver.findElement(By.id("ggjh"));
		
		Actions action=new Actions(driver);
		
		action.dragAndDropBy(wb, 20, 220).perform();
		
		action.clickAndHold(wb).moveByOffset(50, 20).release().build().perform();
	}

}
