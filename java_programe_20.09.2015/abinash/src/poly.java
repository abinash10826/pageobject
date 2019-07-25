class sample20
{
	void disp()
	{
		System.out.println("non argument disp");
	}
}

class sample21 extends sample20
{
	void disp(int arg)
	{
		System.out.println("int argument disp");
	}
	void disp(double arg)
	{
		System.out.println("double argument disp");
	}
}
public class poly {

	public static void main(String[] args) {
		sample21 ref=new sample21();
		ref.disp(10);
		ref.disp(5.5);
		ref.disp();
		
		System.out.println("----------------");
		
	}

}
