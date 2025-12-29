package selenium_wait;



import selenium.wait_method.*;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import selenium.wait_method.WebdriverUtil;

public class Implicitly_wait {
	
	public static void main(String[] args) throws InterruptedException  {
		
		WebdriverUtil wlib=new WebdriverUtil();
               
		WebDriver driver=new FirefoxDriver();
          driver.manage().window().maximize();
         
     
		 //open the gamil browser
		
	    driver.get("https://mail.google.com");
	    
	        
	        //Identify the email edit box in GUI
	        
	        WebElement wbe=driver.findElement(By.id("identifierId"));
            
            wbe.sendKeys("abinash10826");
            
            
           //identify the next button
            WebElement wbB=driver.findElement(By.xpath("//span[text()='Next']"));
            
            //click on the element
            
            wbB.click();
         
            //identify the password editbox
            
            WebDriverWait wait=new WebDriverWait(driver, 20);
            wait.until(ExpectedConditions.visibilityOfElementLocated(By.name("password")));
           
            WebElement pwb=driver.findElement(By.name("password"));
            
             pwb.sendKeys("abi");
            
           
            
            //identify the next button
            WebElement wbB1=driver.findElement(By.xpath("//span[text()='Next']"));
            
            //click on the element
           
            wbB1.click();
          
           
            
           //select all check box
           String x="//table[@class='F cf zt']/tbody/tr/td[2]//div[@role='checkbox']";
            
            List <WebElement> lst=driver.findElements(By.xpath(x));
        	
            System.out.println(lst.size());
            
            for(WebElement wb:lst)
            {
            	  
           	 wb.click();
            }
            
        
            
        	
            //logout
            
                  WebElement wlog=driver.findElement(By.xpath("//a[contains(@aria-label,'Google Account')]"));
                  
                  wlog.click();
                   
                  WebElement logout=driver.findElement(By.xpath("//a[text()='Sign out']"));
                  
                  logout.click();
                  
                  driver.close();
                  
            
	}

}
