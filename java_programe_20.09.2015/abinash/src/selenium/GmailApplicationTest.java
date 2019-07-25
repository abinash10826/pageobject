package selenium;

import java.util.List;

import javax.swing.event.TreeWillExpandListener;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GmailApplicationTest {

	public static void main(String[] args) throws InterruptedException {
		 WebDriver driver=new FirefoxDriver();
         
         //open the gamil browser
         driver.get("https://gmail.com");
         
         //Identify the email edit box in GUI
                 WebElement wbe=driver.findElement(By.id("identifierId"));
                 
                 wbe.sendKeys("abinash10826");
                 
         //identify the next button
                 WebElement wbB=driver.findElement(By.xpath("//span[text()='Next']"));
                 
                 //click on the element
                 
                 wbB.click();
                 Thread.sleep(2000);
                 
                 //identify the password editbox
                 
                 WebElement pwb=driver.findElement(By.name("password"));
                 
                 
                 pwb.sendKeys("abin");
                 
                 
                 //identify the next button
                 WebElement wbB1=driver.findElement(By.xpath("//span[text()='Next']"));
                 
                 //click on the element
                 
                 wbB1.click();
                 
                 Thread.sleep(20000);
                 
                 //select all check box
                 String x="//table[@class='F cf zt']/tbody/tr/td[2]//div[@role='checkbox']";
                 
                 List <WebElement> lst=driver.findElements(By.xpath(x));
                 System.out.println(lst.size());
                 
                 for(WebElement wb:lst)
                 {
                	 wb.click();
                 }
                 
                 
                 
                 //logout
                 /*
                       WebElement wlog=driver.findElement(By.xpath("//span[@class='gb_ab gbii']"));
                       
                       wlog.click();
                       
                       Thread.sleep(9000);
                       
                       WebElement logout=driver.findElement(By.id("gb_71"));
                       
                       logout.click();
                       
                       driver.close();
                       */
                 
         
	}
	

}
