package selenium;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class MakemyTrip {
	
	public static void main(String[] args) throws InterruptedException {
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
