package window_handling_selenium;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Callender_Window {

	public static void main(String[] args) {
                
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		//navigate to cleartrip site
		driver.get("https://www.cleartrip.com");
		
		//enable the calender window
	    driver.findElement(By.id("DepartDate")).click();
	    
	    int monthcount=0;
	    
	    while(monthcount<24)
	    {
	    	try{
	    		//select the date
	    		String x="//td[@data-year='2019'and@data-month='6']/a[text()='6']";
	    		driver.findElement(By.xpath(x)).click();
	    		
	    	}
	    	catch(Throwable t){
	    		
	    		System.out.println("particular date found");}
	    		driver.findElement(By.xpath("//a[@title='Next' and @class='nextMonth ']")).click();
	    	
	    	
	    	monthcount++;
	    }

        
	}

}
