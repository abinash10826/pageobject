
public class constructer_recursion {
	
	static int i;
	public constructer_recursion(int i)
	{
		this.i=i;
		if(i<=10)
		{System.out.println(i);
		}
		constructer_recursion ref1=new constructer_recursion(i++);
	}
	
	
	public static void main(String[] args) {
		
		constructer_recursion ref=new constructer_recursion(1);
		
	}

}
