package jUnit;

import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Annotation1 {
	
String msg="abinash";
	
	@BeforeClass
	
	public static void configbeforeclass()
	{
		System.out.println("lunch browser");
	}
	
	@Before
	public void configbefor()
	{
		System.out.println("login");
	}
	
	@Test
	
	public void test1()
	{
		assertEquals("abinash", msg);
		
		System.out.println("hello2");
	}
	
	
	@After
	
	public void configafter()
	{
		System.out.println("logout");
	}
	@AfterClass
	public static void configafterclass()
	{
		System.out.println("close the browser");
	}


}
