package window_handling_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class Alert_window {
	
          @Test
          
          public void mainTest()
          {
        	  
          
		
	    WebDriver driver=new FirefoxDriver();
	    driver.manage().window().maximize();
	    
	    driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	    
	    //navigate the sbi url
	    
	    driver.get("https://retail.onlinesbi.com/retail/login.htm");
	    
	    //clik on continue to login
	    
	    driver.findElement(By.xpath("//a[text()='CONTINUE TO LOGIN']")).click();
	    
	    //click on login button
	    
	    driver.findElement(By.xpath("//input[@title='Login']")).click();
	    
	    //pass a driver control to alert
	    
	    Alert alt=driver.switchTo().alert();
	    
	    
	    //capture alert box
	    
	    String str=alt.getText();
	    
	    System.out.println(str);
	    
	    //click on ok button
	    
	    alt.accept();
	    
	    
	    
	    
	    
	    
	          
          }

}
