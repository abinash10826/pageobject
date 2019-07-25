class A1
{
	int i=20;
	void disp()
	{
		System.out.println("disp in class A1");	
	}
}
class B2 extends A1
{
	double d=3.3;
	void demo()
	{
		System.out.println("demo in class B2");
	}
}
public class conversion1 {

	public static void main(String[] args)
	{
		A1 ref1=(A1)new B2();
		System.out.println(ref1.i);
		ref1.disp();
		//B2 ref2=new B2();
		//System.out.println(ref2.d);
		//ref2.demo();

	}

}
