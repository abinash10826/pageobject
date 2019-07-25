package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Acti_Timedynamic {
	
	public static void main(String[] args) throws InterruptedException {
	
		/*Test Data*/
		String username="admin";
		String password="manager";
		String customerName="HDFC_004";
System.setProperty("webdriver.chrome.driver", "C:\\selenium cromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://sai-pc/login.do");
		
		
		/* step 1 : verify login page */
		if (driver.getTitle().contains("Login")) 
		System.out.println("Login page is showing==PASS");
		else 
		System.out.println("Login page is not showing==FAIL");
		
		/* step 2 : login to app */
		driver.findElement(By.name("username")).sendKeys(username);
		driver.findElement(By.name("pwd")).sendKeys(password);
		driver.findElement(By.id("loginButton")).click();
		Thread.sleep(5000);
		
		/* step 3 : verify home page */
		if (driver.getTitle().contains("Enter Time")) 
			System.out.println("HOME page is showing==PASS");
			else 
			System.out.println("HOME page is not showing==FAIL");
		
		/* step 4 : navigate to task page */
		WebElement Wb2=driver.findElement(By.xpath("//div[text()='Tasks']"));
		Thread.sleep(2000);
		Wb2.click();
		
		/* step 5 : verify task page */
		if (driver.getTitle().contains("Task List")) 
			System.out.println("OPEN TASK page is showing==PASS");
			else 
			System.out.println("OPEN TASK page is not showing==FAIL");
		
		//navigate to project & customer
		
		driver.findElement(By.linkText("Projects & Customers")).click();
		
		//click on all check box
		
		String x="//table[@class='active_customers_projects listTable']/tbody/tr[*]/td[6]/input";
		
		List<WebElement> lst=driver.findElements(By.xpath(x));
		for(WebElement wb:lst)
		{
			wb.click();
		}
		
		
		
		
		
		
		
		
		
	}

}
