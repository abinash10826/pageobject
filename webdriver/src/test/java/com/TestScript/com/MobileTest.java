package com.TestScript.com;

import java.util.ArrayList;
import java.util.List;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;
import com.ObjectRepository.com.MobileHomePage;
import com.generic.library.BaseClass;

@Listeners(com.generic.library.Listnerclass.class)

public class MobileTest extends BaseClass
{
	
	
@Test
	
	public void mobilelistTest() throws Throwable
	{
		com.generic.library.FileUtils utl=new com.generic.library.FileUtils();
		String expTitle="THIS IS DEMO SITE FOR   ";
		String exphTitle="MOBILE";
		
	 /*verify home page*/
		com.ObjectRepository.com.HomePage hp=PageFactory.initElements(driver, com.ObjectRepository.com.HomePage.class);
		
		String actTitle=hp.getverifyhomepage().getText();

		boolean status=actTitle.contains(utl.getExcelData("Sheet1", 0, 0));
		Assert.assertTrue(status);
		
		Reporter.log("home page displayed===>pass");
		
		/*navigate mobile menu*/
		
		hp.clickmobilemenu();
		
		
		/*Verify Title of the page */
		
		MobileHomePage mhp=PageFactory.initElements(driver, MobileHomePage.class);
		
		 String acthTitle=mhp.getmobilePage().getText();
		 
		 boolean status1=acthTitle.contains(exphTitle);
		 
		 Assert.assertTrue(status1);
		 
		 Reporter.log("veryfy title of the page===>pass");
		 
		 /*sorted product by name*/
		 
		 mhp.sortedByName();
		 
		 /*verify product name in sortedwise*/
		 
		 List<WebElement> link=mhp.verifyName();
		 
		 ArrayList<String> exceldata=utl.getExcelAllData("Sheet2", 0);
		
		for (WebElement web : link) {
			
			String ffff=web.getText();
			
			boolean result=exceldata.contains(ffff);
			
			
			
			System.out.println("excel "+exceldata.toString());
			System.out.println("--- "+ffff);
			Assert.assertTrue(result);
			
			
		}
			
		
		
		
	
	}
	

}
