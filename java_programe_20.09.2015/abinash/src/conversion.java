class A
{
	int i=30;
}
class B extends A
{
	double d=4.4;
}

public class conversion {

	public static void main(String[] args) 
	{
		A ref=new B();
System.out.println(ref.i);
System.out.println(ref.i);
	}

}
