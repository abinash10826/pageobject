package selenium;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.List;
import java.util.TreeSet;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;


public class Duplicate_Multi_Elements {
	
	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "C:\\selenium extension\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://www.first-names-meanings.com/names/name-AVINASH.html");
		
		List<WebElement> list=driver.findElements(By.xpath("//table[@summary='Liste des ommentaires']/tbody/tr[*]/td[2]"));
		
		
		/*Robot robot=new Robot();
		robot.keyPress(KeyEvent.VK_PAGE_DOWN);
		robot.keyRelease(KeyEvent.VK_PAGE_DOWN);*/
		
		JavascriptExecutor jscript=(JavascriptExecutor)driver;
		
		jscript.executeScript("window.scrollBy(0,1500)");
		
		int count=list.size();
		
		System.out.println(count);
		
		TreeSet set=new TreeSet<>();
		
		for (int i = 0; i < count; i++) {
			
			String str=list.get(i).getText();
			
			String str1=str.toLowerCase();
			set.add(str1);
			//System.out.println(str);
			
		}
		
		System.out.println(set);
		
	}

}
