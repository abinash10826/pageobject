package selenium;

import org.testng.annotations.Test;

public class annotaion {
	
	
	@Test(priority=-1)
	
	public void config1()
	{
		System.out.println("1");
	}
	
   @Test(priority=4)
	
	public void config2()
	{
		System.out.println("2");
	}
   @Test(priority=3)

 public void config3()
{
	System.out.println("3");
}
  @Test(priority=2)

public void config4()
{
	System.out.println("4");
}
 @Test(priority=1)

public void config5()
{
	System.out.println("5");
}
@Test(priority=5)

public void config6()
{
	System.out.println("6");
}

}
