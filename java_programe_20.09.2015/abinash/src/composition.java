
public class composition {

	
	void print()
	{
		System.out.println("print");
		
	}
	
	void print(String s)
	
	{
		System.out.println(s);
	}
	
}

class Device
{
	static int i=20;
	static composition out=new composition();
	
}
