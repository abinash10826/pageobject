package com.api.project;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Platform;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;
import org.testng.internal.Version;

public class SeleniumGrid {
	
	@Test
	
	public void config() throws Throwable
	{
		
		//ThreadLocal<RemoteWebDriver> t=new ThreadLocal<>();
		DesiredCapabilities des=DesiredCapabilities.chrome();
		
		       des.setPlatform(Platform.WINDOWS);
		       des.setBrowserName("chrome");
		       des.setPlatform(Platform.WIN10);
		       
		       
		       WebDriver driver=new RemoteWebDriver(new URL("http://192.168.0.109:5001/wd/hub"), des);
		       driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);
		                driver.get("https://gmail.com");
		                
}            
	}


