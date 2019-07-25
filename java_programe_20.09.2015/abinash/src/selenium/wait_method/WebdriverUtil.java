package selenium.wait_method;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebdriverUtil {

	
		//wait for pageloading
		public void waitforpageload(WebDriver driver)
		{
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		}
		
		//wait for element visibility
		
		public void waitforelementpresent(WebDriver driver,WebElement wb)
		{
			WebDriverWait wait=new WebDriverWait(driver, 40);
			wait.until(ExpectedConditions.visibilityOf(wb));
		}
		
		//custom wait
		//wait for element complete load & available in Gui
		public void waitforcompleteElementToload(WebElement wb) throws InterruptedException
		{int count=0;
		while(count<20)
		{
			try
			{
				wb.isDisplayed();
				break;
			}
			catch(Throwable t) {
				System.out.println("handle the expection & continue");
			}
			Thread.sleep(2000);
			count++;
		}
	}}


