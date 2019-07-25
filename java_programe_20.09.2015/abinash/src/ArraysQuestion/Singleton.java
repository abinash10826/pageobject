package ArraysQuestion;

public class Singleton {
	
	private static Singleton t=new Singleton(10826,1892);
	static int id;
	static int rollno;
	private Singleton(int id,int rollno)
	
	{
		this.id=id;
		this.rollno=rollno;
		
		
	}
	
	public static  Singleton getback()
	{
		System.out.println(id+" & "+rollno);
		return t;
	}

}
