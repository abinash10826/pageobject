package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dynamicdropdown {

	public static void main(String[] args) {
		
		String expoption="c";
		boolean flag=false;
                
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		 driver.get("file:///C:/Users/Sai/Desktop/html/dropdown.html");
	        
	        WebElement mwb=driver.findElement(By.xpath("//select[@multiple='true']"));
	        
	        Select sel=new Select(mwb);
	        
	        List<WebElement> list=sel.getOptions();
	        
	        
	        System.out.println(list.size());
	        
	        for (int i = 0; i < list.size(); i++) {
	        	
	        	String actoption=list.get(i).getText();
	        	
	        	System.out.println(actoption);
	        	
	        	if(expoption.equals(actoption))
	        	{
	        		sel.selectByVisibleText(expoption);
	        	    flag=true;
	        		break;   		
	        	}
	        	if(flag==true)
	        	{
	        		System.out.println(expoption);
	        	}
	        	else{
	        		System.out.println("not available");	
	        	}
	        		
	        	}
	        	
	        	
	       
	        	
	        	
			}
	}


