package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Auto_suggest_editbox {

	public static void main(String[] args) {
                     
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		//pass data auto suggest box
		
		driver.findElement(By.name("q")).sendKeys("intel");
		
		Actions act=new Actions(driver);
		
		act.sendKeys(Keys.ENTER).perform();
		
		//capture all URL
		 
		List<WebElement>lst=driver.findElements(By.xpath("//cite[contains(text(), 'https')]"));
		
		for(WebElement wb:lst)
		{
			String result=wb.getText();
			System.out.println(result);
		}
		
	}

}
