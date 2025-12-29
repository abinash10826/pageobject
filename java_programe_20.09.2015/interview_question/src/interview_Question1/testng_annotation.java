package interview_Question1;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testng_annotation {
	
	@Test(groups= {"smoke","regression"})
	 
	 public void testCase1() {
	 
	 System.out.println("This is the Test Case 1");
	 
	 }
	 
	 @Test(groups= {"smoke","regression"})
	 
	 public void testCase2() {
	 
	 System.out.println("This is the Test Case 2");
	 
	 }
	 
	 @BeforeMethod(groups= {"smoke","regression"})
	 
	 public void beforeMethod() {
	 
	 System.out.println("This will execute before every Method");
	 
	 }
	 
	 @AfterMethod(groups= {"smoke","regression"})
	 
	 public void afterMethod() {
	 
	 System.out.println("This will execute after every Method");
	 
	 }
	 
	 @BeforeClass(groups= {"smoke","regression"})
	 
	 public void beforeClass() {
	 
	 System.out.println("This will execute before the Class");
	 
	 }
	 
	 @AfterClass(groups= {"smoke","regression"})
	 
	 public void afterClass() {
	 
	 System.out.println("This will execute after the Class");
	 
	 }
	 
	 @BeforeTest(groups= {"smoke","regression"})
	 
	 public void beforeTest() {
	 
	 System.out.println("This will execute before the Test");
	 
	 }
	 
	 @AfterTest(groups= {"smoke","regression"})
	 
	 public void afterTest() {
	 
	 System.out.println("This will execute after the Test");
	 
	 }
	 
	 @BeforeSuite(groups= {"smoke","regression"})
	 
	 public void beforeSuite() {
	 
	 System.out.println("This will execute before the Test Suite");
	 
	 }
	 
	 @AfterSuite(groups= {"smoke","regression"})
	 
	 public void afterSuite() {
	 
	 System.out.println("This will execute after the Test Suite");
	 
	 }

}
