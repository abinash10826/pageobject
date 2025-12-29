package selenium;

import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Amazon_iphonepricelist {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.amazon.in");
		Thread.sleep(4000);
		
		//search for iphone
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Apple iphone XR",Keys.ENTER);
		Thread.sleep(6000);
		
		//capture iphone price
		
		String x="//h2[text()='Apple iPhone XR (White, 3GB RAM, 64GB Storage)']/../../../../div[2]/div[1]/div[1]/a/span[2]";
		String result=driver.findElement(By.xpath(x)).getText();
		
		              System.out.println(result);
	}

}
