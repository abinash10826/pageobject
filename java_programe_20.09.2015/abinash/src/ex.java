class sample12
{
	sample12(double arg)
	{
	System.out.println(arg);
	}}
	class sample13 extends sample12

	{
		sample13(int arg)
		{
			super(4.4);
			System.out.println(arg);
		}

	}
	class sample14 extends sample13
	{
	sample14(int arg1,double arg2)
	{
		super(5);
		System.out.println(arg1+arg2);
		
	}}

class  ex
{
	public static void main(String[] args) 
	{
		sample14 ref=new sample14(4,5.5);
	}
}
