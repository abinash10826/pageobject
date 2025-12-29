package window_handling_selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class File_Attachment {

	public static void main(String[] args) throws Throwable {
                
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		//navigate the url
		
		driver.get("https://my.naukri.com/account/register/basicdetails");
		
		//click on i am  freshers button
		
		driver.findElement(By.xpath("//button[text()='I am a Fresher']")).click();
		
		//click on upload button
		
		driver.findElement(By.name("uploadCV")).click();
		
		/*get the location of file in to java object*/
		
		StringSelection path=new StringSelection("C:\\Users\\Sai\\Desktop\\lenka_resume.docx");
		
		//get the control object of the system toolkit
		
		Toolkit t=Toolkit.getDefaultToolkit();
		
		//get the control object of the mouse clipboard
		
		Clipboard c=t.getSystemClipboard();
		
		//copy the path in mouse tip
		
		c.setContents(path, null);
		
		//native key strokes for CTRL,V and ENTER key
		
		Robot robot=new Robot();
		
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.keyRelease(KeyEvent.VK_V);
		
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		
	}

}
