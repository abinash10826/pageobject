package selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

import hashcode.string;


public class ImageCordinate {
	
	public static void main(String[] args) {
		
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://facebook.com");
		
		WebElement wb=driver.findElement(By.xpath("//img[contains(@src,'xNjS.png')]"));
		
		         Point p=wb.getLocation();
		         
		         System.out.println(p.getX());
		         System.out.println(p.getY());
		         
		         System.out.println("-------------------");
		         
		          Dimension dim=wb.getSize();
		          
		          System.out.println(dim.getHeight());
		          System.out.println(dim.getWidth());
		          
		          System.out.println("-------------------");
		          
		          WebElement wb1=driver.findElement(By.xpath("//input[@value='1']"));
		                  wb1.click();
		          boolean result=wb1.isSelected();
		          
		          System.out.println(result);
		          
		          System.out.println("----------------");
		          
		          WebElement wb3=driver.findElement(By.id("u_0_o"));
		          
		          String result1=wb3.getAttribute("aria-label");
		          
		          System.out.println(result1);
		          
		          WebElement wb4=driver.findElement(By.id("birthday-help"));
		          
		                     System.out.println(wb4.getText());
		                  
		           String result3=wb4.getCssValue("color");
		           
		           System.out.println(result3);
		         
		         
		         driver.close();
		
	}

}
