package com.generic.library;

import java.io.File;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class Listnerclass implements ITestListener{

	public void onTestStart(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestSuccess(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailure(ITestResult result) {
		
		  String faildTestName=result.getMethod().getMethodName();
		  
		  EventFiringWebDriver edriver=new EventFiringWebDriver(BaseClass.driver);
		  
		  File src=edriver.getScreenshotAs(OutputType.FILE);
		  File des=new File("./screenshot/"+faildTestName+".png");
		  
		  try {
			  
			  FileUtils.copyFile(src, des);
			
		    } 
		  
		  catch (Exception e) {
			// TODO: handle exception
		}
		
	}

	public void onTestSkipped(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		// TODO Auto-generated method stub
		
	}

	public void onStart(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	public void onFinish(ITestContext context) {
		// TODO Auto-generated method stub
		
	}

	
	
		
	
	

}
