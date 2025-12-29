package com.generic.library;

import java.io.File;
import java.util.Date;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	

	public static WebDriver driver;
	public FileUtils flib=new FileUtils();
	public WebDriverUtils util=new WebDriverUtils();
	
	@BeforeSuite
	
	public void configBS()
	{
		System.out.println("Connect To DATABASE Before Suite");
	}
	
	@BeforeClass
	
	public void configBC() throws Throwable
	{
		    System.out.println("====Lunch Browser====");
		     Properties pobj=flib.getPropertyFileObject();
		          String browserName=pobj.getProperty("browser");
		          
		          if(browserName.equals("firefox"))
		          {
		        	  driver=new FirefoxDriver();
		          }
		          
		          else if(browserName.equals("chrome"))
		          {
		        	  System.setProperty("webdriver.chrome.driver", "./src/test/java/chromedriver.exe");
		        	  
		        	  driver=new ChromeDriver();
		          }
		          
		          else if (browserName.equals("ie"))
		          {
		        	  System.setProperty("webdriver.ie.driver", "./src/test/java/IEDriverServer.exe");
		        	  
		        	  driver=new InternetExplorerDriver();
		          }
		          
		          driver.manage().window().maximize();
		          
		          util.waitForPageToLoad(driver);
		          	          	     
	}
	
	@BeforeMethod
	
	public void configBM() throws Throwable
	{
		System.out.println("====LogIn====");
		
		Properties pobj=flib.getPropertyFileObject();
		
		driver.get(pobj.getProperty("url"));
		
		/*driver.findElement(By.name("username")).sendKeys(pobj.getProperty("user"));
		driver.findElement(By.name("pwd")).sendKeys(pobj.getProperty("password"));
		driver.findElement(By.id("loginButton")).click();*/
		
	}
	
	@AfterMethod
	public void configAM()
	{
		/*System.out.println("logout");
		driver.findElement(By.linkText("Logout")).click();*/
	}
	
	@AfterClass
	public void configAC()
	{
		System.out.println("====close browser====");
		driver.close();
	}
	
	@AfterSuite
	
	public void configAS() throws Throwable
	{
		System.out.println("Disconnect From DATABASE");
		
		String cDate=new Date().toString().replace(" ", "_").replace(":", "_");
		
		File destFile=new File(".//backUP//"+cDate+"_Batch_Result.html");
		
		File srcFile=new File(".//test-output/emailable-report.html");
		
		org.apache.commons.io.FileUtils.copyFile(srcFile, destFile);
	}

	

}
