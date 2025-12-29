class sample16
{
	int i=20;
}
class demo extends sample16
{
	int  i=30;
	void disp()
	{
		int i=100;
		System.out.println("local variable value is"+i);
		System.out.println("instance variable value of same class"+this.i);
		System.out.println("instance variable value of superclass"+super.i);
}}

public class java 
{
public static void main(String[]args)
{
	demo ref=new demo();
	ref.disp();
	System.out.println(ref.i);
}
}
