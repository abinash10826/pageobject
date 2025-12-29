class x
{
	char c='A';
}
class y extends x
{
	boolean b=false;
}
class z extends y   
{
	String s="java";
}
public class conversion2 {

	public static void main(String[] args) 
	{
	  y ref=new z();// convert z super class and y subclass.
            z ref1=(z)ref;
            System.out.println(ref1.c);
            System.out.println(ref1.b);
            System.out.println(ref1.s);
	}
	

}
