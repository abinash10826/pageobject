package Block;

 class sample1 {
	static int i;
	final static double d;
	static
	{
		i=20;
		d=5.5;
		System.out.println("ststic block in sample1");
	}}
	
	public class sample
	{
		
	

   public static void main(String[] args) {
	   
	   System.out.println("main method");
	   System.out.println(sample1.i);
	   System.out.println(sample1.d);
	
}}
