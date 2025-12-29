package abinash;

public class Sample11 {

	public Sample11() 
	{
		this(10.8);
		System.out.println("non argument of sample11");
	}
	Sample11(int arg)
	{
		this();
	System.out.println("int argument of sample11");
	}
Sample11(double arg)
{
this(4,7.8);
	System.out.println("double argument of sample11");
}
Sample11(int arg1,double arg2)
{
	System.out.println("int-double argument of sample11");
}
}

