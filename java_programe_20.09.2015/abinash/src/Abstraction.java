
public abstract class Abstraction {
	
	public Abstraction()
	{
		System.out.println("bye");
	}
	
	abstract  void main();
	
	public void xyz()
	{
		System.out.println("hello");
	}
	

}

class sample extends Abstraction
{
	public sample()
	{
		System.out.println("welcome");
		
	}
	
	void main()
	{
		System.out.println("hi");
	}
	
	
	
	
}
