package interfacekeyword;

public interface Multilevel 
{
	void disp();

}
interface Multilevel1 extends Multilevel
{
	void test();
}
class sample implements Multilevel1
{
	public void disp()
	{
		System.out.println("disp in sample");
	}
	public void test()
	{
		System.out.println("test in sample");
	}
}
