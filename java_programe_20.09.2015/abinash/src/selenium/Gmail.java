package selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Gmail {

	public static void main(String[] args) {

          WebDriver driver=new FirefoxDriver();
          
          //open the gamil browser
          driver.get("https://gmail.com");
          
          //capture title of current webpage
              String pTitle =driver.getTitle();
              
              System.out.println(pTitle);
              
              //page validation/check point
              
              if(pTitle.equals("Gmail"))
              {
            	  System.out.println("login page is displayed==>pass");
              }
              else
              {
            	  System.out.println("login page is notdisplayed==>fail");
            	  
              }
              // capture URL of the current page
              
                      String pageURL=driver.getCurrentUrl();
                      System.out.println(pageURL);
                      
              //capture htmlpage code of the current webpage
                      System.out.println(driver.getPageSource());
                      driver.close();
                      
              
              
              
	}

}
