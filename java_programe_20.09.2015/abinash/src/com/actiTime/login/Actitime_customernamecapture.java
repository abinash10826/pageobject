package com.actiTime.login;

import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Actitime_customernamecapture {

	@Test(priority=2)
	 public void ActitimeLogin() throws Throwable
	 {
           Reporter.log("hello", true);
		/*Test Data*/
		String username="admin";
		String password="manager";
		String customerName="HDFC_678";
        WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
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
		
		
		/* step 3 : verify home page */
		if (driver.getTitle().contains("Enter Time")) 
			System.out.println("HOME page is showing==PASS");
			else 
			System.out.println("HOME page is not showing==FAIL");
		
		/* step 4 : navigate to task page */
		WebElement Wb2=driver.findElement(By.xpath("//div[text()='Tasks']"));
		Wb2.click();
		
		/* step 5 : verify task page */
		if (driver.getTitle().contains("Tasks")) 
			System.out.println("OPEN TASK page is showing==PASS");
			else 
			System.out.println("OPEN TASK page is not showing==FAIL");
		
		//navigate to project & customer
		
		driver.findElement(By.linkText("Projects & Customers")).click();
		
		//click on all check box
		
		String x="//table[@class='active_customers_projects listTable']/tbody/tr/td[1]";
		
		List<WebElement> lst=driver.findElements(By.xpath(x));
		for(WebElement wb:lst)
		{
			String result=wb.getText();
			
			System.out.println(result);
		}	
	}
	@Test(priority=1)
	
	public void makemytrip() throws Throwable{
	WebDriver driver=new FirefoxDriver();
	driver.manage().window().maximize();
	 //open the Amazon browser
	driver.get("https://www.makemytrip.com/");
	Thread.sleep(8000);
	//enter from
   WebElement swr=driver.findElement(By.id("hp-widget__sfrom"));
          
   swr.clear();
   swr.sendKeys("BLR");
   Thread.sleep(4000);
   Actions act=new Actions(driver);
   act.sendKeys(Keys.ENTER).perform();
   Thread.sleep(4000);
   

   
 //enter To
   WebElement swr1=driver.findElement(By.id("hp-widget__sTo"));
          
   swr1.clear();
   swr1.sendKeys("GOI");
   Thread.sleep(4000);
   Actions act1=new Actions(driver);
   act1.sendKeys(Keys.ENTER).perform();
   
  //get the current system date in "dd:mm:yyyy" format
   
   
                String nextdate=getcurrentsystemdate();
                String[] datearr=nextdate.split(":");
                int i=Integer.parseInt(datearr[0])+1;
                System.out.println(i);
                String dates=""+i;
               System.out.println(dates);
               String mon=datearr[1];
               String years=datearr[2];
               
               //create a dynamic xpath using system date
               
     String x="(//td[@data-year='"+years+"' and @data-month='"+mon+"']/a[text()='"+dates+"'])[1]";
     
     driver.findElement(By.xpath(x)).click();
               
   
   
}

public static String getcurrentsystemdate()
{
Date date=new Date();

System.out.println(date);
String[] str=date.toString().split(" ");


//get the current day from the date object

int day=date.getDate();

String days=day+"";

//get the current month from the date object

int month=date.getMonth();
 
String months=month+"";

//get the current year from the date object

String year=str[5];

return days+":"+months+":"+year;

	}}



