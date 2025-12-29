package pattern;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverLocater {
	
	public static void main(String[] args) {
		
          WebDriver driver=new FirefoxDriver();
          
          driver.manage().window().maximize();
          
          driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
          
          driver.get("https://www.facebook.com");
          
         List<WebElement> list=driver.findElements(By.xpath("//input[@class='inputtext']"));
                         
                         int count=list.size();
                    System.out.println(list.size());
                    
                    for (int i = 0; i <list.size(); i++) {
                    	
                    	int x=list.get(i).getLocation().getX();
                    	
                        if(x==789)
                        {
                        	list.get(i).sendKeys("abinash");
                        }
                        else if(x!=789)
                        {
                        	list.get(i).sendKeys("njdnjdn");
                        }
					}
	}

}
