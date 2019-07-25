package window_handling_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Yahoo_frame {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		
		//navigate to yahoo.com
		
		driver.get("https://yahoo.com");
		
		//pass the driver control to frame
		
		driver.switchTo().frame("google_ads_frame1");
		
		//click the link inside the frame
		
		driver.findElement(By.xpath("//img[@class='img_ad']")).sendKeys(Keys.ENTER);
		
		
	}

}
