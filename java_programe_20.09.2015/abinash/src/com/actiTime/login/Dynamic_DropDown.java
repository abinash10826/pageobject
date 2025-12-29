package com.actiTime.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * 
 * @author ABINASH PANDA
 *
 */

public class Dynamic_DropDown {

	public static void main(String[] args) {
		
		/*Test Data*/
		String Home="Email";
		String Expoption="testing";
		boolean flag=false;
                    
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Sai/Desktop/html/drop%20down.html");
		
		/* step 1 : verify Home page */
		
		if(driver.getTitle().equals(Home))
		{
			System.out.println("Home Page is Showing==>Pass");
		}
		else
		{
			System.out.println("Home Page is Not Display==>Fail");
		}
		
		/* step 2: Identify dynamic select dropdown*/
		
	   WebElement dwb=driver.findElement(By.xpath("//select[@multiple='true']"));
	   
	   /* step 3: create object to select class*/
	   
	           Select sel=new Select(dwb); 
	           
	   /* step 4: capture all the option webElement in Dynamic select dropdown*/
	            
	           List <WebElement> list=sel.getOptions();
	           
	   /* step 4: Iterate the collection list using for loop*/
	           for (int i = 0; i < list.size(); i++) {
	        	   
	        	   String Actoption=list.get(i).getText();
	        	  // System.out.println(Actoption);
	           
	    /* step 5: find the expected option from the collection*/
	        	   if(Actoption.contains(Expoption))
	        	   {
	        		   sel.selectByVisibleText(Actoption);
	        		   flag=true;
	        		   
	        		   
	        	   }
	           }
	        	   if(flag==true)
	        	   {
	        		   System.out.println(Expoption+ " option is avilable==>pass");
	        	   }
	        	   else
	        	   {
	        		   System.out.println("options are not available");
	        	   }
				
			}
	           
	           
	           
	           
	           
		
		
	}


