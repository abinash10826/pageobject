package interfacekeyword;

public interface hirachical {

	void disp();
	void test();
	

}
class sample4 implements hirachical
{
	public void disp()
	{
		System.out.println("disp in sample4");
	}
	public void test()
	{
		System.out.println("test in sample4");
	}
}
class sample5 implements hirachical
{
	public void disp()
	{
		System.out.println("disp in sample5");
	}
	public void test()
	{
		System.out.println("test in sample5");
	}
}
