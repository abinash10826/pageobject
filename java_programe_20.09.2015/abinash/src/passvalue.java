class cv
{
	int i=40;
	double g=60;
}
class bb
{
	void demo(cv c)
	{
		System.out.println(c);
		System.out.println(c.i);
		System.out.println(c.g);
	}
}

public class passvalue {

	public static void main(String[] args) {
		bb ref=new bb();
		ref.demo(new cv());

	}

}
