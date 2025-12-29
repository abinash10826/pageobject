package selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Fileupload {
	
public static void main(String[] args) throws Throwable {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://naukri.com");
		
		driver.findElement(By.xpath("//input[@value='Register with us']")).click();
		driver.findElement(By.xpath("//button[text()='I am a Fresher']")).click();
		driver.findElement(By.name("uploadCV")).click();
		
		
		StringSelection sel=new StringSelection("C:\\Users\\Sai\\Desktop\\Sql_Interview.pdf");
		
		Toolkit t=Toolkit.getDefaultToolkit();
		
		         Clipboard c=t.getSystemClipboard();
		         
		         c.setContents(sel, null);
		         
		         Robot robot=new Robot();
		         
		         robot.keyPress(KeyEvent.VK_CONTROL);
		         robot.keyPress(KeyEvent.VK_V);
		         
		         robot.keyRelease(KeyEvent.VK_V);
		         robot.keyRelease(KeyEvent.VK_CONTROL);
		         
		         
		         robot.keyPress(KeyEvent.VK_ENTER);
		         robot.keyRelease(KeyEvent.VK_ENTER);
		         

}}
