   class pen
   {
	String inkcolor;
	pen(String color)
	{
	inkcolor=color;	
	}
	void write()
	{
		System.out.println("writting using"+(' ')+inkcolor+(' ')+  "color pen");
	}
    }

  class student1
   {
	int id;
	String name;
	student1(int id,String name)
	{
		this.id=id;
		this.name=name;
	}
	void makenotes(pen p1)
	{
		p1.write();
		System.out.println("id is"+(' ')+ this.id +(' ')+ "name is" +(' ')+this.name);
	}
    }

   public class passbyvalue {

	public static void main(String[] args) 
	{
		student1 ref=new student1(1234,"abinash");
		//ref.makenotes(new pen("green"));
		//ref.makenotes(new pen("blue"));
		pen p1=new pen("green");
		ref.makenotes(p1);
		

	}

}
