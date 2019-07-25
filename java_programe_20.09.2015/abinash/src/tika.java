 class pen1
   {
	String inkcolor;
	pen1(String color)
	{
	inkcolor=color;	
	//}
	//void write()
	//{
		System.out.println("writting using"+(' ')+inkcolor+(' ')+  "color pen");
	}
    }
class stationary 
{
	pen1 sellpen(String color)
	{
		return new pen1(color);
	}
}
public class tika {

	public static void main(String[] args) 
	{
		stationary shop=new stationary();
		pen1 p1=shop.sellpen("green");
		

	}

}
