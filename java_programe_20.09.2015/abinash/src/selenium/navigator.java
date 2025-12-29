package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;

/**
 * 
 * @author ABINASH PANDA
 *
 */

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navigator {

	public static void main(String[] args) throws InterruptedException {
             
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://gmail.com");
		
              /*verify Email login page*/
		
		        if(driver.getTitle().equals("Gmail"))
		        {
		        	System.out.println("Gmail login page is showing==>Pass");
		        }
		        else
		        {
		        	System.out.println("Gmail login page is not showing==>Fail");
		        }
		        
		        Thread.sleep(4000);
		        
		        /*Login in to Application*/
		        
		        driver.findElement(By.id("identifierId")).sendKeys("abinash10826@gmail.com");
		        driver.findElement(By.xpath("//span[text()='Next']")).click();
		        
		        Thread.sleep(2000);
		        driver.navigate().back();
		        driver.navigate().forward();
		        driver.navigate().refresh();
		        
		        Dimension d=new Dimension(100, 300);
		        
		        driver.manage().window().setSize(d);
		       
		
		
	}

}
