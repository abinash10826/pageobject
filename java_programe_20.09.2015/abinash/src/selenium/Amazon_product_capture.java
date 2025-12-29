package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_product_capture {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		
		
		
	     driver.get("https://www.amazon.in");
	     Thread.sleep(8000);
	     
	     //search for iPhone "//a[text()='4 GB & More']/../.."
	     
	     driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iphone",Keys.ENTER);
	     
	     Thread.sleep(2000);
	     
	     //select the fillter 4GB Ram,64GB internal memory
	     
	     driver.findElement(By.xpath("//span[text()='4 GB & More']/../../input")).click();
	     Thread.sleep(2000);
	     driver.findElement(By.xpath("//span[text()='64 GB']/../../input")).click();
	     
	     //capture inventory info from the GUI
	     Thread.sleep(2000);
	     String result=driver.findElement(By.xpath("//a[text()='4 GB & More']/../..")).getText();
	     
	     System.out.println(result);
	     
	}

}
