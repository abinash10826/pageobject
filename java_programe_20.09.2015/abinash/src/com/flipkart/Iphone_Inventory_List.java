package com.flipkart;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Iphone_Inventory_List {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		//navigate window
		
		driver.get("https://www.flipkart.com/");
		
         Thread.sleep(2000);
		
		//close the hidden window
		
		driver.findElement(By.xpath("//button[text()='✕']")).click();
		
		//search for iphone 128GB internal memory
		driver.findElement(By.name("q")).sendKeys("iphone",Keys.ENTER);
		
		//identify the drop down element
		
		WebElement scrol=driver.findElement(By.xpath("//div[text()='128 - 255.9 GB']/../div[1]"));
		
		Select st=new Select(scrol);
		 
		st.selectByVisibleText("128 - 255.9 GB");
		
		
	}

}
