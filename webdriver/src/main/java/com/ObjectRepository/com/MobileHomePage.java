package com.ObjectRepository.com;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.ui.Select;

public class MobileHomePage {
	
	

	@FindBy(xpath="//h1[text()='Mobile']")
	
	private WebElement mobileHomePage;
	
@FindBy(xpath="//div[@class='col-main']/div[@class='category-products']/div[@class='toolbar']/div[@class='sorter']/div/select")
	 private WebElement sorted;

  
	@FindBys({@FindBy(xpath="//li[@class='item last']/div/h2/a")})
	
	private java.util.List<WebElement> xyz;
	public WebElement getmobilePage()
	{
		return mobileHomePage;
	}
	
	public void sortedByName()
	{
		Select sel=new Select(sorted);
		
		sel.selectByVisibleText("Name");
	}
	public List<WebElement> verifyName()
	{
		
		return xyz;
		
	}
	


}
