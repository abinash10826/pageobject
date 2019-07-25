package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook {

	public static void main(String[] args) throws InterruptedException {
           
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		//verify first name of edit box
		
		Thread.sleep(10000);
		String str=driver.findElement(By.id("u_0_j")).getAttribute("aria-label");
		System.out.println(str);
		
		
		//check image is displayed or not
		
		    WebElement imgwb=driver.findElement(By.xpath("//img[contains(@src, 'jS.png')]"));
		    
		    boolean img=imgwb.isDisplayed();
		    System.out.println(img);
		    
		    //get the location of the image
		    
		     Point p=imgwb.getLocation();
		     System.out.println(p.getX());
		     System.out.println(p.getY());
		     
		     Dimension d=imgwb.getSize();
		     
		     System.out.println(d.getHeight());
		     System.out.println(d.getWidth());
		     
		    boolean button =driver.findElement(By.xpath("//input[@value='1']")).isSelected();
		    
		    System.out.println(button);
	}
	
}
