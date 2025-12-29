package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class multilevel {

	public static void main(String[] args) {
             
		
		        WebDriver driver=new FirefoxDriver();
		        
		        driver.manage().window().maximize();
		        
		        driver.get("file:///C:/Users/Sai/Desktop/html/dropdown.html");
		        
		        WebElement mwb=driver.findElement(By.xpath("//select[@multiple='true']"));
		        
		        Select sel=new Select(mwb);
		        
		        boolean stat=sel.isMultiple();
		        
		        if(stat)
		        {
		        	for (int i = 0; i <4; i++) {
		        		
		        		sel.selectByIndex(i);
						
					}
		        }
		        else
		        {
		        	System.out.println("its not a multiselect dropdown");
		        }
		        sel.deselectAll();
	}

}
