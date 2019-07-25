package jUnit;

import static org.testng.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class Annotations {
	
	String msg="abinas";
	
	@Rule
	
	public ErrorCollector collecter=new ErrorCollector();
	
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
		
		System.out.println("hello");
		
		System.out.println("abinash");
	}
	@Test
	
	public void test2()
	{
		System.out.println("hello1");
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
