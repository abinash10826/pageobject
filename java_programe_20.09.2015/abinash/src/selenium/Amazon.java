package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Amazon {
	
	WebDriver driver;
	@BeforeTest
	@Parameters("browser")
	
	public void configpara(String browser)
	{
		if(browser.equalsIgnoreCase("firefox")){
			//create firefox instance
				driver = new FirefoxDriver();
			}
			//Check if parameter passed as 'chrome'
			else if(browser.equalsIgnoreCase("chrome")){
				//set path to chromedriver.exe
				System.setProperty("webdriver.chrome.driver","C:\\selenium extension\\chromedriver.exe");
				//create chrome instance
				driver = new ChromeDriver();
			}
	}

	@Test
	public void config() throws Throwable{
		
		
		driver.manage().window().maximize();
		 //open the Amazon browser
		driver.get("https://amazon.in");
		
		Thread.sleep(5000);
		
		//verify the login page
		
		String expage="Online";
		String homepage=driver.getTitle();
		if(homepage.contains(expage))
		{
			System.out.println("amazon home page is verified==>pass");
		}
		else
		{
			System.out.println("amazon home page is not verified==>fail");
		}
		
		Thread.sleep(2000);
		
		 //go to user login page
		
		driver.findElement(By.id("nav-your-amazon")).click();
		
		String userpage="Amazon";
		String user=driver.getTitle();
		if(user.contains(userpage))
		{
			System.out.println("amazon sign page is verified==>pass");
		}
		else
		{
			System.out.println("amazon sign page is not verified==>fail");
		}
		
		//Identify the email edit box in GUI
		
		  driver.findElement(By.id("ap_email")).sendKeys("abinash10826@gmail.com");
		  
		  driver.findElement(By.id("continue")).click();
		  
		  //identify the password box
		//identify the password editbox
          
         driver.findElement(By.id("ap_password")).sendKeys("ab");
         
        // identify the sign in button
         
         driver.findElement(By.id("signInSubmit")).click();
         
         String page="Your Amazon";
 		String yourpage=driver.getTitle();
 		if(yourpage.contains(page))
 		{
 			System.out.println("amazon signin home page is verified==>pass");
 		}
 		else
 		{
 			System.out.println("amazon signin home page is not verified==>fail");
 		}
 		
 		Thread.sleep(10000);
         
 		//logout button verified
 		
 		  WebElement wb=driver.findElement(By.xpath("//span[text()='Hello, abinash']"));
 		  
 		  Actions act=new Actions(driver);
 		  
 		  act.moveToElement(wb).perform();
 		  
 		  
 		  driver.findElement(By.xpath("//span[text()='Sign Out']")).click();
 		  
 		  driver.close();
          
          
         
         
         
          
          
		
		
		
		
		
				

	}

}
