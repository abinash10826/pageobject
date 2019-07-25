package window_handling_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frame {

	public static void main(String[] args) {
            WebDriver driver=new FirefoxDriver();
            driver.manage().window().maximize();
            driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
            
            //navigate the window url
            
            driver.get("https://seleniumhq.github.io/selenium/docs/api/java/");
            
            //pass the driver control to frame-2
            
            driver.switchTo().frame("classFrame");
            
            //click on link, when link present inside the frame
            
            driver.findElement(By.linkText("com.thoughtworks.selenium")).click();
            
            //pass driver control back to main-window
            
            driver.switchTo().defaultContent();
            
            //pass the driver control to frame-3
            
            driver.switchTo().frame("packageFrame");
            
            //click on link,when link present inside the frame
            
            driver.findElement(By.linkText("Action")).click();
	}

}
