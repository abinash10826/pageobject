class Sample1 {
	int i=100;
	void m1()
	{
		System.out.println("sample1 method");
	}
}
class Sample2 extends Sample1
{
	double d=3.3;
	void m2()
	{
		System.out.println("sample2 method");
	}
}
class Sample3 extends Sample1
{
	char c='a';
	void m3()
	{
		System.out.println("sample3 method");
	}
}
class Mainclass
{
	public static void main(String[]args)
	{
		Sample3 ref1=new Sample3();
		System.out.println(ref1.c);
		System.out.println(ref1.i);
		ref1.m3();
		ref1.m1();
		Sample2 ref2=new Sample2();
		ref2.m2();
		ref2.m1();
		System.out.println(ref2.d);
		System.out.println(ref2.i);
		
		
		
	


	
		

	}

}
             