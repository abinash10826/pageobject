package com.actiTime.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

/**
 * 
 * @author ABINASH PANDA
 *
 */

public class ActitimeCreateCustomerTest {
	@Test
	public void CreateCustomer() throws Throwable{
		/*Test Data*/
		String username="admin";
		String password="manager";
		String customerName="HD_004";
		
		WebDriver driver= new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://localhost/login.do");
		
		/* step 1 : verify login page */
		if (driver.getTitle().contains("Login")) 
		System.out.println("Login page is showing==PASS");
		else 
		System.out.println("Login page is not showing==FAIL");
		
		/* step 2 : login to app */
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		
		/* step 3 : verify home page */
		if (driver.getTitle().contains("Enter Time")) 
			System.out.println("HOME page is showing==PASS");
			else 
			System.out.println("HOME page is not showing==FAIL");
		
		/* step 4 : navigate to task page */
		WebElement Wb2=driver.findElement(By.xpath("//div[text()='TASKS']"));
		Thread.sleep(2000);
		Wb2.click();
		
		/* step 5 : verify task page */
		if (driver.getTitle().contains("Task List")) 
			System.out.println("OPEN TASK page is showing==PASS");
			else 
			System.out.println("OPEN TASK page is not showing==FAIL");
		
		/* step 6 : navigate to create customer */
		driver.findElement(By.cssSelector(".addNewButton")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='+ New Customer']")).click();
		Thread.sleep(2000);
		WebElement wb3=driver.findElement(By.id("customerLightBox_titlePlaceholder"));
		
		/* step 7 : verify create customer page */
		if ("Create New Customer".equals(wb3.getText())) 
			System.out.println("Create Customer page is showing==PASS");
			else 
			System.out.println("Create Customer page is not showing==FAIL");
		
		/* step 8 : Create Customer */
		driver.findElement(By.id("customerLightBox_nameField")).sendKeys(customerName);
		driver.findElement(By.xpath("//span[text()='Create Customer']")).click();
		
		/* step 9 : verify customer existence */
		if ("Customer with the specified name already exists".equals(driver.findElement(By.id("customerLightBox_nameDuplicateError")).getText())) { 
			System.out.println("Customer with the specified name already exists.");
			Thread.sleep(3000);
			driver.findElement(By.id("customerLightBoxCloseButton")).click();
			Thread.sleep(2000);
			//driver.quit();
			}
		else
			System.out.println("Customer has been created successfully==PASS");
		
			/*Hi, I am unable to catch green color
		
		/* step 10 : logout to app */ 
		/*WebElement wb1=driver.findElement(By.id("logoutLink"));
		Thread.sleep(1000);
		wb1.click();
		driver.close();*/
	}
}

