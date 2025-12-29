package pattern;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

public class web {
	
	@Test
	public void configTest3()
	{
		System.out.println("test1");
	}
	
	@Test
	public void configTest8()
	{
		System.out.println("test2");
	}
	
	@BeforeSuite
	
	public void configTest()
	{
		System.out.println("before suit");
	}
	
	@BeforeClass
	public void configTest1()
	{
		System.out.println("before class");
	}
	
	@BeforeMethod
	public void configTest2()
	{
		System.out.println("before method");
	}
	
	@AfterMethod
	public void configTest4()
	{
		System.out.println("after method");
	}
	@AfterClass
	public void configTest5()
	{
		System.out.println("after class");
	}
	@AfterSuite
	public void configTest6()
	{
		System.out.println("after suit");
	}

}
