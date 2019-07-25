package selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Yahoo_dynamicelement {

	public static void main(String[] args) throws InterruptedException {
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium cromedriver\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://yahoo.com");
		
		Thread.sleep(8000);
		//identify all the links available in trending now division
		
		String x="//li[@data-category='trending news']/ul/li";
		
		List<WebElement> lst=driver.findElements(By.xpath(x));
		
		for(WebElement wb:lst)
		{
			String result=wb.getText();
			System.out.println(result);
		}
		
		driver.close();

	}

}
