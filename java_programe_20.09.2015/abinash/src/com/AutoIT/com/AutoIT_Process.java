package com.AutoIT.com;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AutoIT_Process {
	
	
	public static void main(String[] args) throws Throwable {
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.tinyupload.com/");
		
		driver.findElement(By.name("uploaded_file")).click();
		
		Runtime.getRuntime().exec("E:\\New folder\\scriptautoit.exe");
		
		Thread.sleep(4000);
		driver.close();
	}

}
