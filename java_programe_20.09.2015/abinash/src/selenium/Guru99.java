package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Guru99 {

	public static void main(String[] args) {
		WebDriver driver=new FirefoxDriver();
        
        //open the guru99.com browser
        driver.get("http://clicks.aweber.com/y/ct/?l=GRNLe&m=3tZajL7VP9FEjy9&b=prPbHMlViYiMOepFCRUZDw");
        
        //Identify the user edit box in GUI
        WebElement wbe=driver.findElement(By.name("uid"));
            wbe.sendKeys("mngr164195");
            
            //identify the password edit box in UGI
                         WebElement pass=driver.findElement(By.name("password"));
                         
                         pass.sendKeys("pubUjUz");
                         
                         //identify the login button
                         
                                      WebElement login=driver.findElement(By.name("btnLogin"));
                                      
                                      login.click();

	}

}
