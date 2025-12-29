package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.thoughtworks.selenium.webdriven.commands.GetText;

public class erroemsg {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://gmail.com");
		
		  //Identify the email edit box in GUI
        driver.findElement(By.id("identifierId")).sendKeys("abinashpanda.kbl");
        
         //identify the next button
        driver.findElement(By.xpath("//span[text()='Next']")).click();
          
        Thread.sleep(2000);
        
        //identify the password editbox
        
        driver.findElement(By.name("password")).sendKeys("selen");
        
        //identify the next button
        driver.findElement(By.xpath("//span[text()='Next']")).click();
          
        
        Thread.sleep(4000);
        //verify error msg
        
          String expmsg="Wrong password. Try again or click Forgot password to reset it.";
        
     WebElement errwb= driver.findElement(By.xpath("//div[text()='Wrong password. Try again or click Forgot password to reset it.']"));
     
     
        	String actmsg=errwb.getText();
        	System.out.println(actmsg);
        	
        	if(expmsg.equals(actmsg))
        	{
        		System.out.println("error msg is display==> pass");
        	}
        	else
        	{
        		System.out.println("error msg not displayed==> fail");
        	}
        	
        	//error msg should be in red color
        	
        	Thread.sleep(4000);
        	
        	String expcolor="rgba(213, 0, 0, 1)";
        
		     String actcolor=errwb.getCssValue("color");
		     
		     boolean color=expcolor.equals(actcolor);
		     
		     System.out.println(color);
		     
		     driver.close();
		     		
		     	
	}

}
