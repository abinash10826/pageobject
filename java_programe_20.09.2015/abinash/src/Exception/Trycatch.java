package Exception;

public class Trycatch {

	public static void main(String[] args) {
                 
		int a=5;
		int b=5;
		int arr[]=new int[3];
		
		try
		{
			int c=a/b;
		//System.out.println(c);
		System.out.println(arr[3]);
		System.out.println(c);
	}
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e);
		}
		finally
		{
			System.out.println("finally always here");
		}
		System.out.println("hello");

}}
