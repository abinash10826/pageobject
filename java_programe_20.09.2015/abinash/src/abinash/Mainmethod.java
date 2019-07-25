package abinash;

public class Mainmethod {

	public static void main(String[] args) {
		Sample4 ref=new Sample4();

	}

}
class Sample3
{
	Sample3()
	{
	super();
	System.out.println("sample3 constructer");
}}
class Sample4 extends Sample3
{
	Sample4()
	{
		super();
		System.out.println("sample4 constructer");
		
	}
}
