package abinash1;

public abstract class Demo {
	abstract void disp();
	abstract void test();

}
 class sample2 extends Demo
{
	void disp()
	{
		System.out.println("Disp in sample2");
	}
	void test()
	{
		System.out.println("test in sample2");
	}
}
class sample3 extends Demo
{
	void test()
	{
		System.out.println("test in sample3");
	}
	void disp()
	{
		System.out.println("disp in sample3");
	}
}