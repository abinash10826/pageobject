package interfacekeyword;

public interface  singlelevel 
{
	void disp();
	void test();
	 
}
class singlelevel1 implements singlelevel
{
	public void disp()
	{
		System.out.println("disp in singlelevel1");
	}
	public void test()
	{
		System.out.println("test in singlelevel1");
	}
	public static void main()
	{
		
	}
}