package com.actiTime.login;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

/**
 * 
 * @author ABINASH PANDA
 *
 */

public class ActitimeCreateNewCustomerTest {

	@Test
	public void CreateNewCustomerTes() throws Throwable {
                      
		/*Test Data*/
		String username="admin";
		String password="manager";
		String Newcustomer="SBI1";
		boolean exist=false;
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://sai-pc/login.do");
		
		/* step 1 : verify login page */
		if (driver.getTitle().contains("Login")) 
		System.out.println("Login page is showing==PASS");
		else 
		System.out.println("Login page is not showing==FAIL");
		
		/* step 2 : login to app */
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(2000);
		
		/* step 3 : verify home page */
		if (driver.getTitle().contains("Enter Time")) 
			System.out.println("HOME page is showing==PASS");
			else 
			System.out.println("HOME page is not showing==FAIL");
		
		/* step 4 : navigate to task page */
		WebElement Wb2=driver.findElement(By.xpath("//div[text()='Tasks']"));
		Thread.sleep(2000);
		Wb2.click();
		
		/* step 5 : verify task page */
		if (driver.getTitle().contains("Tasks")) 
			System.out.println("OPEN TASK page is showing==PASS");
			else 
			System.out.println("OPEN TASK page is not showing==FAIL");
		
		/* step 4 : navigate to project */
		driver.findElement(By.linkText("Projects & Customers")).click();
		Thread.sleep(2000);
		
		/* step 3 : verify Projects & Customers page */
		if (driver.getTitle().contains("Active")) 
			System.out.println("HOME page is showing==PASS");
			else 
			System.out.println("HOME page is not showing==FAIL");
		
		/*Identyfy if customer exist or not*/
		
     WebElement cs =driver.findElement(By.xpath("//select[@class='controlBorder']"));
     
                 Select sel=new Select(cs);     
              List<WebElement> lst=sel.getOptions();
              
              
       	   /* step 4: Iterate the collection list using for loop*/
       	           for (int i = 0; i < lst.size(); i++) {
       	        	   
       	        	   String ActiveCustomer=lst.get(i).getText();
       	        	   
       	        	   	if(ActiveCustomer.contains(Newcustomer))
       	        	   	{
       	        	   		exist=true;
       	        	   		break;
       	        	   	}
       	        	   	else
       	        	   	{
       	        	   		exist=false;
       	        	   	}
       	        		
		
	                    }
       	           
       	           
       	        if(exist)
	        	   {
	        		  
	        		   System.out.println("Customer allready exits");
	        	   }
	        	   else
	        	   {
	        		/*  navigate create new customer*/
	        		   
	        		   driver.findElement(By.xpath("//input[@value='Create New Customer']")).click();
	        		   
	        		   
	        		   /*create new customer*/
	        		   
	        		   driver.findElement(By.xpath("//input[@type='text']")).sendKeys(Newcustomer);
	        		   driver.findElement(By.xpath("//input[@type='submit']")).click();
	        		   
	        		   Thread.sleep(2000);
	        		   
	        		   //verify the customer create or not
	        		   WebElement capture =driver.findElement(By.xpath("//span[@class='successmsg']"));
	        		   
	        		   System.out.println(capture.getText());
	        	   }
	        	   

}}
