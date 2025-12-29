package com.generic.library;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebDriverUtils {

	
	//wait for page to load
	
		public void waitForPageToLoad(WebDriver driver)
		{
			
			driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
			
		}
		
		public void waitForElementPresent(WebDriver driver,WebElement wb)
		{
			WebDriverWait wait=new WebDriverWait(driver,20 );
			wait.until(ExpectedConditions.visibilityOf(wb));
		}
		
		//custom wait
		//wait for element complete load & available in GUI
		
		public void waitForCompleteToLoad(WebElement wb) throws Throwable
		{
			int count=0;
			
			while(count<20)
			{
				try
				{
					wb.isDisplayed();
					break;
				}
				catch(Exception e) {
					System.out.println("handle the exception & continue");
				}
				
				Thread.sleep(1000);
				
				count++;
			}
		}
		
}
