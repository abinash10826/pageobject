package window_handling_selenium;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;

public class File_Download {
	public static void main(String[] args) throws Throwable {
	
	/*FirefoxProfile profile=new FirefoxProfile();
	profile.setPreference("browser.download.folderList", 0);
	
	profile.setPreference("browser.helperApps.neverAsk.saveToDisk", "application/zip");
	//profile.setPreference("browser.download.dir", "D:\\");		
	*/
	WebDriver driver=new FirefoxDriver();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	driver.get("https://maven.apache.org/download.cgi");
	
	//click on link
	driver.findElement(By.linkText("apache-maven-3.6.0-bin.zip")).click();
	Thread.sleep(2000);
	Robot robot=new Robot();
	
	robot.keyPress(KeyEvent.VK_ENTER);
	

}}
