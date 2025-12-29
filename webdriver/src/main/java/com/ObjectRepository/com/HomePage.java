package com.ObjectRepository.com;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage {
	
	
	@FindBy(xpath="//h2[contains(text(),'This is demo site')]")
	private WebElement verifyHomePage;
	
	@FindBy(xpath="//a[text()='Mobile']")
	private WebElement clickOnMobileMenu;
	
	public WebElement getverifyhomepage()
	{
		
		return verifyHomePage;
	}
	
	public void clickmobilemenu()
	{
		clickOnMobileMenu.click();
	}


}
