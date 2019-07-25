package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Flipkart {

	public static void main(String[] args) throws InterruptedException {
              
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(2000);
		
		//close the hidden window
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//search for iphone
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		//capture inventry info from the Gui
		
		Thread.sleep(8000);
		
		String output=driver.findElement(By.xpath("//span[contains(text(),'Showing')]")).getText();
		
		System.out.println(output);
		driver.close();
	}

}
