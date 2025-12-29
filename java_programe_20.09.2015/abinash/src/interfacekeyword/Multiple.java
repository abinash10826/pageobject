package interfacekeyword;

public interface Multiple {
	void disp();
	
}
interface Multiple1 
{
	void test();
}
class sample1 implements Multiple,Multiple1
{
	public void disp()
	{
		System.out.println("disp in sample1");
	}
	public void test()
	{
		System.out.println("test in sample1");
	}
}
